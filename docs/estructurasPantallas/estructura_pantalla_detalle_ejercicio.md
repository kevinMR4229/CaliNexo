# Estructura de la pantalla Detalle de ejercicio

Este documento sirve como mapa para montar la pantalla **Detalle de ejercicio** de CaliNexo usando los componentes que ya existen en la rama `hito/ud3`.

## Estructura general

```text
Scaffold
│
├── topBar
│   └── header
│
├── content
│   └── LazyColumn
│       │
│       ├── pageTitle
│       │
│       ├── ExerciseMediaCard
│       │   ├── InfoChip → nivel
│       │   ├── InfoChip → tiempo
│       │   └── InfoChip → fuerza
│       │
│       ├── MuscleGroupSection
│       │   └── InfoChip × cantidad de músculos
│       │
│       ├── [PENDIENTE] ExerciseStatsCard
│       │   ├── series
│       │   ├── repeticiones
│       │   └── descanso
│       │
│       ├── Text("CÓMO REALIZARLO")
│       ├── InstructionStepCard
│       ├── InstructionStepCard
│       ├── InstructionStepCard
│       │
│       └── ButtonApp("Iniciar Ejercicio")
│
└── bottomBar
    └── [PENDIENTE] Navegación inferior
```

## Orden visual de la pantalla

```text
┌──────────────────────────────────────┐
│ header                               │
├──────────────────────────────────────┤
│ pageTitle                            │
│ ←            Dominadas            ♡  │
│ ExerciseMediaCard                    │
│ ├── InfoChip("Nivel Intermedio")     │
│ ├── InfoChip("45 seg por serie")     │
│ └── InfoChip("Fuerza Base")          │
│ MuscleGroupSection                   │
│ ├── InfoChip("Espalda")              │
│ ├── InfoChip("Bíceps")               │
│ └── InfoChip("Core")                 │
│ [PENDIENTE] ExerciseStatsCard        │
│ 3 Series × 8-10 Reps | Descanso 90s  │
│ CÓMO REALIZARLO                      │
│ InstructionStepCard(step = 1)        │
│ InstructionStepCard(step = 2)        │
│ InstructionStepCard(step = 3)        │
│ ButtonApp("Iniciar Ejercicio")        │
├──────────────────────────────────────┤
│ [PENDIENTE] BottomNavigation         │
└──────────────────────────────────────┘
```

## Esqueleto aproximado en Compose

> Este código representa la **estructura**, no pretende ser todavía la implementación final de la pantalla.

```kotlin
@Composable
fun ExerciseDetailScreen() {

    Scaffold(
        topBar = {
            header(
                data = HeaderData(
                    logo = R.drawable.logo_mejorado,
                    nombre = "CaliNexo"
                )
            )
        },
        bottomBar = {
            // BottomNavigation(...)
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {

            item {
                pageTitle(
                    data = PageTitleData(
                        pageTittle = "Dominadas",
                        arrowBack = R.drawable.arrow_back,
                        heart = R.drawable.ic_favorite_border,
                        onIconoIzq = {},
                        onIconoDer = {}
                    )
                )
            }

            item {
                ExerciseMediaCard(
                    data = ExerciseMediaCarddata(
                        image = R.drawable.imagen_dominadas_prueba,
                        level = "Intermedio",
                        time = 45,
                        strengh = "Fuerza Base"
                    )
                )
            }

            item {
                MuscleGroupSection(
                    data = MuscleGroupSectionData(
                        title = "Músculos principales",
                        muscles = listOf(
                            Muscle(name = "Espalda", efford = Eford.HIGH),
                            Muscle(name = "Bíceps", efford = Eford.MEDIUM),
                            Muscle(name = "Core", efford = Eford.MEDIUM)
                        )
                    )
                )
            }

            item {
                // [PENDIENTE] ExerciseStatsCard(...)
            }

            item {
                Text(text = "CÓMO REALIZARLO")
            }

            item {
                InstructionStepCard(
                    data = InstructionStepCardData(
                        stepNumber = 1,
                        numberColor = Color.Red,
                        numberBackgroundColor = Color.Gray,
                        title = "Agarre y Posición",
                        titleColor = Color.White,
                        description = "Sujétate a la barra...",
                        descriptionColor = Color.White,
                        cardColor = TertiaryColor
                    )
                )
            }

            item {
                InstructionStepCard(
                    data = InstructionStepCardData(
                        stepNumber = 2,
                        numberColor = Color.Red,
                        numberBackgroundColor = Color.Gray,
                        title = "Tracción Completa",
                        titleColor = Color.White,
                        description = "Sube el cuerpo...",
                        descriptionColor = Color.White,
                        cardColor = TertiaryColor
                    )
                )
            }

            item {
                InstructionStepCard(
                    data = InstructionStepCardData(
                        stepNumber = 3,
                        numberColor = Color.Red,
                        numberBackgroundColor = Color.Gray,
                        title = "Bajada Controlada",
                        titleColor = Color.White,
                        description = "Baja de forma controlada...",
                        descriptionColor = Color.White,
                        cardColor = TertiaryColor
                    )
                )
            }

            item {
                ButtonApp(
                    data = ButtonData(
                        text = "Iniciar Ejercicio",
                        textColor = Color.Black,
                        backgroundColor = PrimaryColor
                    )
                )
            }
        }
    }
}
```

## Componentes ya disponibles

- `header`
- `pageTitle`
- `ExerciseMediaCard`
- `InfoChip`
- `MuscleGroupSection`
- `InstructionStepCard`
- `ButtonApp`

## Componente principal pendiente

### `ExerciseStatsCard`

Debe representar el bloque del mockup que muestra:

```text
3 Series × 8-10 Reps       Descanso
                           90 seg
```

Una posible estructura sería:

```text
ExerciseStatsCard
├── zona principal
│   ├── series
│   └── repeticiones
└── zona de descanso
    └── tiempo de descanso
```

## Otros elementos pendientes

La barra de navegación inferior aparece en el mockup, pero actualmente no existe un componente específico para ella dentro de `ui/component`.
