/----------------------------------------------------------------------------------------------------------------------/

Ficha de requerimiento: Creación

Requerimiento: Permitir que los luchadores puedan equiparse con diferentes conjuntos de armas y armaduras, los cuales pueden cambiar durante el transcurso del juego. Problema: Implementar directamente la lógica de equipamiento dentro de las clases individuales de los luchadores puede resultar en un código difícil de mantener y modificar (pq tendrías que editar cada clase individualmente) a medida que se agregan nuevos tipos de armas y armaduras. Solución: Separar la construcción de objetos de representación y así permitir que los luchadores puedan ser equipados con diferentes combinaciones de armamento de manera flexible sin comprometer código. Patrón a aplicar: Builder https://refactoring.guru/es/design-patterns/builder/java/example#:~:text=Builder%20es%20un%20patrón%20de,el%20mismo%20proceso%20de%20construcción.

/----------------------------------------------------------------------------------------------------------------------/

Ficha de requerimiento: Comportamiento Requerimiento: Implementar una mecánica donde un personaje pueda ejecutar un ataque más poderoso luego de realizar el mismo ataque más de 3 veces (en este caso solo para el atacar). Problema: Los personajes necesitan un sistema que les permita mejorar sus habilidades de ataque de forma dinámica, Solución: Crear varias clases que representen los estados del personaje, cada una correspondiente a un nivel de habilidad de ataque.

(if AtaqueNormal > 3: Change AtaqueFuerte() )

Patrón a aplicar: Sate https://refactoring.guru/es/design-patterns/state/java/example

/----------------------------------------------------------------------------------------------------------------------/

Ficha de requerimiento: Estructural Requerimiento: Los luchadores pueden mejorar sus habilidades de ataque al ganar exp. de comandante, desbloqueando técnicas avanzadas a medida que progresa el juego. Problema: Implementar directamente la lógica de desbloqueo de nuevas técnicas dentro de las clases individuales resulta en código difícil de mantener y extender. Solución: Permitir que los luchadores puedan adquirir nuevas habilidades de ataque de manera dinámica durante el juego. Al crear clases decoradoras que agreguen nuevas funcionalidades a los luchadores. Patrón a aplicar: Decorator https://refactoring.guru/es/design-patterns/decorator/java/example

/----------------------------------------------------------------------------------------------------------------------/
