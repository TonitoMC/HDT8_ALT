# Hoja de Trabajo 8: Priority Queue + Heaps (Alternativo)
### Autor: José Antonio Mérida Castejón
Este programa simula un sistema de atención de pacientes que llegan a la sección de Emergencias de un hospital. Al entrar un paciente se ingresa con:

Nombre del paciente, descripción del síntoma, código de emergencia

Esta información se encuentra dentro de un archivo "pacientes.txt" en el siguiente formato
```
Juan Perez, fractura de pierna, C
Maria Ramirez, apendicitis, A
Lorenzo Toledo, chikunguya, E
Carmen Sarmientos, dolores de parto, B
```
El sistema indica cual paciente debe ser atendido, mostrando nombre, síntome y prioridad en orden de prioridad más alta primero. El output con el archivo de entrada actual es el siguiente:
```
Maria Ramirez, apendicitis,A
Carmen Sarmientos, dolores de parto,B
Juan Perez, fractura de pierna,C
Lorenzo Toledo, chikunguya,E
```
## Versión  Original
Esta versión del programa se desarrolló utilizando un PriorityQueue del Java Collections Framework como una versión alternativa, la versión original implementa una clase llamada VectorHeap para implementar la interfaz PriorityQueue. La funcionalidad es la misma, únicamente es la implementación que varía.
## Instalación
Este proyecto utiliza [Maven](https://maven.apache.org/) y fue escrito en [Java](https://www.java.com/en/), por lo cual es necesario instalar estas dependencias para poder correr el programa.
