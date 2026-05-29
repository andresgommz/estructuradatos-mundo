# Estructura de Datos — Mundo

Proyecto en Java que modela objetos del mundo real aplicando los fundamentos de la Programación Orientada a Objetos: encapsulamiento, sobrecarga de constructores y polimorfismo de métodos.

---

## Descripción

El proyecto crea e instancia tres clases independientes que representan entidades del mundo real: un planeta y dos jugadores de distintos deportes. Cada clase aplica los principios básicos de POO mediante atributos privados, métodos de acceso y comportamientos propios de cada entidad.

---

## Qué hace el programa

1. Instancia un objeto `PlanetaTierra` con datos físicos reales (nombre, radio, masa, población, presencia de agua).
2. Instancia un objeto `JugadorTenis` con atributos deportivos (nombre, edad, altura, ranking, país).
3. Instancia un objeto `JugadorBasketball` con atributos deportivos (nombre, edad, altura, equipo, puntos).
4. Imprime el nombre de cada objeto mediante métodos getter.

---

## Funcionalidades principales

**PlanetaTierra**
- Almacena datos físicos del planeta (radio, masa, población, agua).
- Métodos: `rotar()`, `orbitar()`, `calcularGravedad()`, `esHabitable()`, `mostrarInfo()`.
- Sobrecarga de constructores y del método `mostrarInfo()`.

**JugadorTenis**
- Modela un tenista profesional con ranking y país de origen.
- Métodos: `entrenar()`, `jugarPartido()`, `ganarPunto()`, `subirRanking()`, `mostrarDatos()`.
- Sobrecarga de constructores y del método `mostrarDatos()`.

**JugadorBasketball**
- Modela un jugador de baloncesto con equipo y puntos acumulados.
- Métodos: `entrenar()`, `anotar()`, `defender()`, `totalPuntos()`, `mostrarJugador()`.
- Sobrecarga de constructores y del método `mostrarJugador()`.

---

## Tecnologías

| Tecnología | Uso |
|---|---|
| Java | Lenguaje principal |
| NetBeans IDE | Entorno de desarrollo (estructura de proyecto) |

---

## Requisitos previos

- JDK 8 o superior
- NetBeans IDE (recomendado) o cualquier IDE compatible con Java

---

## Instalación y configuración

1. Clona el repositorio:

```bash
git clone https://github.com/andresgommz/estructuradatos-mundo.git
```

2. Abre NetBeans y selecciona **File > Open Project**.
3. Navega hasta la carpeta `mundo` y ábrela como proyecto.

---

## Cómo ejecutar

**Desde NetBeans:**

- Haz clic en el botón **Run Project** o presiona `F6`.

**Desde la terminal:**

```bash
cd mundo
javac -d build/classes src/mundo/*.java
java -cp build/classes mundo.Mundo
```

### Salida esperada

```
Planeta: Tierra
Tenista: Carlos
Basquetbolista: Juan
```

---

## Estructura de archivos

```
estructuradatos-mundo/
└── mundo/
    ├── src/
    │   └── mundo/
    │       ├── Mundo.java              # Clase principal (main)
    │       ├── PlanetaTierra.java      # Clase que modela un planeta
    │       ├── JugadorTenis.java       # Clase que modela un tenista
    │       └── JugadorBasketball.java  # Clase que modela un basquetbolista
    ├── nbproject/                      # Configuración de NetBeans
    ├── build.xml                       # Script de construcción Ant
    └── manifest.mf                     # Manifiesto del proyecto
```

---

## Conceptos de POO aplicados

| Concepto | Aplicación en el proyecto |
|---|---|
| Encapsulamiento | Todos los atributos son `private` con getters y setters |
| Sobrecarga de constructores | Cada clase tiene 3 constructores distintos |
| Sobrecarga de métodos | `mostrarInfo()`, `mostrarDatos()` y `mostrarJugador()` tienen versiones con y sin parámetros |
| Instanciación de objetos | `Mundo.java` crea instancias de las tres clases |

---

## Posibles errores comunes

| Error | Causa | Solución |
|---|---|---|
| `cannot find symbol` al compilar | Archivos `.java` no están en el mismo paquete | Verificar que todos los archivos declaren `package mundo;` |
| El proyecto no abre en NetBeans | Carpeta raíz incorrecta | Abrir la carpeta `mundo/` directamente, no la raíz del repositorio |

---

<div align="center">

Desarrollado para el curso de <strong>Estructura de Datos</strong> · Universidad Autónoma de Bucaramanga

</div>
```
