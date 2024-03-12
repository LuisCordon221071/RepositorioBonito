import simpy
import random

RANDOM_SEED = 150
CPU_INSTRUCCIONES = 3
MEMORY_CAPACITY = 100
NUM_PROCESOS = 200
INTERVALO = 5  
NUM_CPUS = 2  

def proceso(env, nombre, ram, cpus):
    memoria_necesaria = random.randint(1, 10)
    with ram.get(memoria_necesaria) as req:
        yield req
        print(f'{nombre} obtiene {memoria_necesaria} de memoria RAM en {env.now}')
        
        instrucciones_totales = random.randint(1, 10)
        instrucciones_restantes = instrucciones_totales
        
        while instrucciones_restantes > 0:
            with cpus.request() as req_cpus:
                yield req_cpus
                instrucciones_a_realizar = min(instrucciones_restantes, CPU_INSTRUCCIONES)
                yield env.timeout(1)  # Se ejecutan las instrucciones en 1 unidad de tiempo
                instrucciones_restantes -= instrucciones_a_realizar
                print(f'{nombre} ha completado {instrucciones_a_realizar} instrucciones en {env.now}')
            
            if instrucciones_restantes <= 0:
                break
            
            rand = random.randint(1, 21)
            if rand == 1:
                print(f'{nombre} pasa a estado Waiting en  {env.now}')
                yield env.timeout(1)  
                print(f'{nombre} vuelve a estado Ready en {env.now}')
            elif rand == 2:
                print(f'{nombre} vuelve a estado Ready en {env.now}')
            else:
                print(f'{nombre} permanece corriendo en {env.now}')
        
        yield ram.put(memoria_necesaria)
        print(f'{nombre} ha liberado {memoria_necesaria} de memoria RAM en {env.now}')
                

def llegada_procesos(env, ram, cpus):
    for i in range(NUM_PROCESOS):
        env.process(proceso(env, f'Proceso-{i+1}', ram, cpus))
        yield env.timeout(random.expovariate(1.0 / INTERVALO))  


random.seed(RANDOM_SEED)
env = simpy.Environment()
ram = simpy.Container(env, init=MEMORY_CAPACITY, capacity=MEMORY_CAPACITY)
cpus = simpy.Resource(env, capacity=NUM_CPUS)  
env.process(llegada_procesos(env, ram, cpus))
env.run(until=3000)







 