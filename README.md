# DOSW_ParcialT1_PaulaLozano

## 1. Diagrama de contexto
![Diagrama de Contexto](DOSW-ParcialT1/docs/images/DiagramaContexto.png)

En este diagrama identificamos los principales actores que interactúan con el sistema EventSync. Cada uno juega un rol diferente, incluyendo los actores externos que reciben los datos.

## 2.Identificando patrones.

### Primer patrón
**Nombre:**  Strategy 

**Tipo:** Patrón de comportamiento

**Justificación:** En el texto vemos que no todos los usuarios pueden crear cualquier evento, algunos pueden crear ciertos tipos que otros no pueden. Strategy nos permite que el usuario pueda realizar únicamente sus operaciones previamente definidas y permitidas, aliviando la complejidad de usar if-else.


### Segundo patrón
**Nombre:** Adapater

**Tipo:** Patrón estructural

**Justificación:** Los usuarios externos que son los sistemas que entregan datos a EventSync. EventSync recibe estos datos por parte del Sistema académico y RRHH con ciertos formatos como lo son: codigo,nombre,correo y dEnlace_nombre_correo_programa, pero únicamente acepta los que terminen en  @escuelaing.edu.co y  @mail.escuelaing.edu.co, respectivamente.

También podríamos usar patrones como observer para el tema de notificaciones y y Factory en complemento de Strategy para manejar los tipos de eventos.

