# Implementación de Pruebas Unitarias en Proyecto Distribuido

El sistema de gestión de pagos de una fintech requiere una alta confiabilidad y cobertura de pruebas unitarias para asegurar la calidad del software. El objetivo es implementar pruebas unitarias efectivas y utilizar una herramienta de verificación de cobertura para asegurar que al menos el 80% del código esté cubierto.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementación de Pruebas Unitarias: Mejores Prácticas y Herramientas |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Puntos Críticos

**Objetivo:** Identificar las áreas del sistema que requieren pruebas unitarias.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el sistema de gestión de pagos y determina las funcionalidades críticas que deben ser cubiertas por pruebas unitarias.

**Entregable:** Lista de funcionalidades críticas con justificación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera funcionalidades que afecten directamente la confiabilidad y seguridad del sistema.
- Piensa en cómo las pruebas unitarias pueden prevenir errores comunes en el dominio de los pagos.

</details>

### Fase 2: Escritura de Pruebas Unitarias

**Objetivo:** Escribir pruebas unitarias para las funcionalidades identificadas.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Escribe pruebas unitarias para las funcionalidades críticas identificadas en la fase anterior.

**Entregable:** Conjunto de pruebas unitarias escritas.

<details>
<summary>Pistas de conocimiento</summary>

- Asegúrate de que cada prueba unitaria cubra un caso de uso específico.
- Considera escenarios de borde y casos de error para hacer tus pruebas más robustas.

</details>

### Fase 3: Verificación de Cobertura

**Objetivo:** Verificar la cobertura de las pruebas unitarias y ajustar si es necesario.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Usa una herramienta de verificación de cobertura para asegurar que al menos el 80% del código esté cubierto por las pruebas unitarias.

**Entregable:** Reporte de cobertura de pruebas unitarias.

<details>
<summary>Pistas de conocimiento</summary>

- Asegúrate de que la cobertura de las pruebas unitarias sea lo más alta posible.
- Identifica áreas del código que no están cubiertas y escribe pruebas adicionales si es necesario.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las pruebas unitarias y por qué son importantes en un sistema de gestión de pagos?
- **paraQueSirve**: ¿Para qué sirve la verificación de cobertura en el contexto de las pruebas unitarias?
- **comoSeUsa**: ¿Cómo se escriben pruebas unitarias efectivas para un sistema de gestión de pagos?
- **erroresComunes**: ¿Cuáles son los errores comunes al escribir pruebas unitarias y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones debes tomar al elegir áreas críticas para las pruebas unitarias y al verificar la cobertura?

## Criterios de Evaluacion

- Identificar áreas críticas del sistema para las pruebas unitarias.
- Escribir pruebas unitarias efectivas para las funcionalidades identificadas.
- Verificar la cobertura de las pruebas unitarias y ajustar si es necesario.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
