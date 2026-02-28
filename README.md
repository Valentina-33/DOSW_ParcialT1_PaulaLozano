# DOSW_ParcialT1_PaulaLozano

## 1. Diagrama de contexto
![Diagrama de Contexto](DOSW-ParcialT1/docs/images/DiagramaContexto.png)

En este diagrama identificamos los principales actores que interactúan con el sistema EventSync. Cada uno juega un rol diferente, incluyendo los actores externos que reciben los datos.

## 2.Identificando patrones.


Había pensado usar Strategy y Adapter para la creación, pero de acuerdo a lo dicho lo cambié y se sigue acoplando a lo que había pensado. 

### Primer patrón
**Nombre:**  Observer 

**Tipo:** Patrón de comportamiento

**Justificación:** Necesitamos enviar notificaciones a los usuarios según lo menciona el texto.


### Segundo patrón
**Nombre:** Factory

**Tipo:** Patrón creacional

**Justificación:** Lo necesitamos para crear los diferentes tipos de eventos que pueden crear los usuarios.

## 3. Requerimientos.

### Requerimientos funcionales
1. Los usuarios deben poder hacer la creación de eventos que deseen, siempre y cuando tengan los permisos necesarios para poder realizarlo.
2. Los usuarios deben poder realizar la inscripción de los asistentes en cada uno de los eventos que creen.
3. Se debe notificar cambios relevantes del evento a los inscritos en este mismo. Estos cambios incluyen: <br>
● El evento cambia de estado a CONFIRMADO <br>
● El evento es CANCELADO <br>
● Se modifica la fecha/hora de inicio <br>
● Se alcanza el cupo máximo


### Requerimientos no funcionales
No vi explícitamente requerimientos no funcionales definidos en el texto, pero en general podría agregar estos:

1. La paleta de colores de la página acorde a la Universidad.  
2. Que sea responsivo para que desde diferentes dispositivos se pueda acceder sin inconvenientes.


*Nota:* El requerimiento funcional que utiliza uno de los patrones dichos es el requerimiento 1, es aquí donde desginamos que los usuarios tengan los permisos necesarios para poder realizar cierta acción.


## 4. Diagramas de caso de uso

Escogí los requerimientos funcionales 1 y 2.

![Diagrama de caso de uso 1](DOSW-ParcialT1/docs/images/DiagramaCU1.png)

## Historia de usuario 1
Como usuario con posibilidad de crear eventos, quiero crear cierto tipo de evento según mis permisos para poder realizar las actividades que tengo propuestas.

![Diagrama de caso de uso 1](DOSW-ParcialT1/docs/images/DiagramaCU2.png)

## Hisotria de usuario 2
Como usuario que ha creado un evento teniendo los permisos, quiero poder agregar a los asistentes para llevar registro de la participación de ellos en las actividades propuestas.

*Nota:* El requerimiento 1 es que utiliza el patrón Facade


# 6. Descomposición de tareas

## Desglose de trabajo: Épicas, Historias de Usuario y Tareas

### 1. Épica:

| Campo | Descripción |
|------|-------------|
| **ID** | EP-01 |
| **Título** | Creación de evento |
| **Descripción** | *Es el objetivo del sistema* |
| **Stakeholder** | *Los usuarios que crean los eventos y quienes participan en ellos* |

### 2. Historias de usuario:

| Campo | Descripción |
|------|-------------|
| **ID** | HU-01 |
| **Título** | Solicitud de creación de evento por parte del usuario|
| **Descripción** | *Como usuario con posibilidad de crear eventos, quiero crear cierto tipo de evento según mis permisos para poder realizar las actividades que tengo propuestas.* |
| **Prioridad** | *[Alta] Debido a que es una función objetivo del sistema* |

### 3. Tareas:

| Campo | Descripción |
|------|-------------|
| **ID** | TR-01 |
| **Título** | Definir los roles de los usuarios|
| **ID de la Historia de Uso asociada** | HU-01 |
| **Descripción** | *Se debe definir los roles de los usuarios* |
| **Tareas requisito** | *Ninguna* |


| Campo | Descripción |
|------|-------------|
| **ID** | TR-02 |
| **Título** | Definir los permisos de cada usuario|
| **ID de la Historia de Uso asociada** | HU-01 |
| **Descripción** | *Cada usuario tiene ciertos permisos asignados* |
| **Tareas requisito** | *TR-01* |

| Campo | Descripción |
|------|-------------|
| **ID** | TR-02 |
| **Título** | Crear un evento|
| **ID de la Historia de Uso asociada** | HU-01 |
| **Descripción** | *Crear un evento que el usuario pida una vez validados sus permisos* |
| **Tareas requisito** | *TR-02* |

