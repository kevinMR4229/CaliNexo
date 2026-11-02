# Estructura de la pantalla Ejercicios

Este documento sirve como mapa para montar la pantalla **Ejercicios** de CaliNexo usando los componentes que ya existen en la rama `hito/ud3`.

## Estructura general

```text
Scaffold
│
├── topBar
│   └── header
│
├── content
│   └── Column / LazyColumn
│       │
│       ├── SearchBar
│       │
│       ├── ExerciseFilters
│       │   └── InfoChip × cantidad de filtros
│       │
│       └── Lista de categorías
│           ├── ExpandableCategory("Principiante")
│           ├── ExpandableCategory("Intermedio")
│           ├── ExpandableCategory("Avanzado")
│           └── ExpandableCategory("Pro")
│
└── bottomBar
    └── [PENDIENTE] Navegación inferior
```

## Orden visual de la pantalla

```text
┌─────────────────────────────────────┐
│ header                              │
├─────────────────────────────────────┤
│ SearchBar                           │
│ ExerciseFilters                     │
│ ├── InfoChip("Nivel")               │
│ └── InfoChip("Zona")                │
│ ExpandableCategory("Principiante")  │
│ ExpandableCategory("Intermedio")    │
│ ExpandableCategory("Avanzado")      │
│ ExpandableCategory("Pro")           │
├─────────────────────────────────────┤
│ [PENDIENTE] BottomNavigation        │
└─────────────────────────────────────┘
```

## Esqueleto aproximado en Compose

> Este código representa la **estructura**, no pretende ser todavía la implementación final de la pantalla.

```kotlin
@Composable
fun ExerciseScreen() {

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
                SearchBar(
                    data = SearchBarData(
                        icon = R.drawable.search,
                        text = "",
                        onTextChange = {}
                    )
                )
            }

            item {
                ExerciseFilters(
                    data = ExerciseFiltersData(
                        filters = listOf(
                            FilterOption(name = "Nivel", onClick = {}),
                            FilterOption(name = "Zona", onClick = {})
                        ),
                        backgroundColor = SecondaryColor
                    )
                )
            }

            item {
                ExpandableCategory(
                    data = ExpandableCategoryData(
                        text = "Principiante",
                        textColor = LettersBlackBackground,
                        icon = R.drawable.outline_arrow_forward_ios_24,
                        iconColor = Color.White
                    )
                )
            }

            item {
                ExpandableCategory(
                    data = ExpandableCategoryData(
                        text = "Intermedio",
                        textColor = LettersBlackBackground,
                        icon = R.drawable.outline_arrow_forward_ios_24,
                        iconColor = Color.White
                    )
                )
            }

            item {
                ExpandableCategory(
                    data = ExpandableCategoryData(
                        text = "Avanzado",
                        textColor = LettersBlackBackground,
                        icon = R.drawable.outline_arrow_forward_ios_24,
                        iconColor = Color.White
                    )
                )
            }

            item {
                ExpandableCategory(
                    data = ExpandableCategoryData(
                        text = "Pro",
                        textColor = LettersBlackBackground,
                        icon = R.drawable.outline_arrow_forward_ios_24,
                        iconColor = Color.White
                    )
                )
            }
        }
    }
}
```

## Componentes ya disponibles

- `header`: cabecera superior de CaliNexo.
- `SearchBar`: campo de búsqueda de ejercicios.
- `ExerciseFilters`: agrupa los filtros de la pantalla.
- `InfoChip`: utilizado internamente para representar cada filtro.
- `ExpandableCategory`: representa una categoría o nivel que posteriormente podrá expandirse.

## Pendiente

- `ExpandableCategorySection`: todavía no existe como componente independiente; puede agrupar todos los `ExpandableCategory`.
- Contenido expandido de cada categoría: lista de ejercicios del nivel.
- Navegación inferior: aparece en el mockup pero aún no hay componente específico dentro de `ui/component`.
