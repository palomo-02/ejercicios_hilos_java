# ☕ Práctica: Estados del Hilo y Programación Concurrente en Java

Este proyecto forma parte de las prácticas educativas de **Desarrollo de Aplicaciones Multihilo en Java**, orientadas a la comprensión del **ciclo de vida de los hilos**, el uso de **ExecutorService** y la **programación concurrente moderna**.

---

## 🎯 Objetivos de la práctica

- Comprender el ciclo de vida de un hilo (`NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, `TERMINATED`).
- Implementar clases que extienden `Runnable` y ejecutar con `Thread`.
- Crear simulaciones de ejecución aleatoria de varios hilos.
- Aplicar técnicas modernas de concurrencia mediante `ExecutorService` y `CompletableFuture`.
- Visualizar el resultado en un entorno educativo estructurado con **Bootstrap**.

---

## 🧱 Estructura del repositorio

| Carpeta / Rama | Descripción |
|-----------------|--------------|
| `main` | Contiene la práctica en HTML con Bootstrap y las instrucciones generales. |
| `feature/estado-new` | Ejemplo de hilo creado pero no iniciado. |
| `feature/estado-runnable` | Ejemplo de hilo en ejecución. |
| `feature/estado-blocked` | Demostración de bloqueo con `synchronized`. |
| `feature/estado-waiting` | Ejemplo de hilo en espera indefinida con `wait()`. |
| `feature/estado-timed-waiting` | Ejemplo de espera temporal (`sleep`). |
| `feature/estado-terminated` | Hilo finalizado tras completar su ejecución. |
| `feature/simulador-nhilos` | Método `nHilos(int n)` para crear y ejecutar hilos aleatoriamente. |
| `feature/executor-service-demo` | Uso de `ExecutorService` con un pool de hilos. |
| `feature/completablefuture-demo` | Encadenamiento de tareas asíncronas con `CompletableFuture`. |

---

## 🧩 Clase principal: `Hilo.java`

```java
public class Hilo implements Runnable {
    private final String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("🟢 Iniciando hilo: " + nombre +
                           " en " + Thread.currentThread().getName());
        try {
            Thread.sleep((int)(Math.random() * 500 + 200));
        } catch (InterruptedException e) {
            System.out.println("⚠️ " + nombre + " interrumpido");
        }
        System.out.println("🔴 Finaliza hilo: " + nombre);
    }
}
```

---

## 🧮 Ejemplo: ejecución de N hilos aleatorios

```java
public static void nHilos(int n) {
    List<Thread> lista = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
        Thread t = new Thread(new Hilo("Hilo-" + i));
        lista.add(t);
    }

    Collections.shuffle(lista);
    for (Thread t : lista) {
        t.start();
        try {
            Thread.sleep((int)(Math.random() * 300));
        } catch (InterruptedException ignored) {}
    }

    for (Thread t : lista) {
        try { t.join(); } catch (InterruptedException ignored) {}
    }

    System.out.println("✅ Todos los hilos han terminado su ejecución.");
}
```

---

## 🚀 Ejemplo con `ExecutorService`

```java
ExecutorService pool = Executors.newFixedThreadPool(4);
for (int i = 1; i <= 5; i++) pool.submit(new Hilo("tarea-" + i));
pool.shutdown();
pool.awaitTermination(3, TimeUnit.SECONDS);
```

---

## 🧩 Visualización interactiva

El archivo `index.html` utiliza **Bootstrap 5** para presentar los ejemplos mediante **acordeones** y **tablas ilustrativas** con íconos descriptivos de cada método del objeto `Thread`.

---

## 🐙 Cómo empezar

1. Realiza un **fork** de este repositorio desde  
   👉 [https://github.com/profeInformatica101/ejercicios_hilos_java](https://github.com/profeInformatica101/ejercicios_hilos_java)

2. Clona tu fork:
   ```bash
   git clone https://github.com/<tu_usuario>/ejercicios_hilos_java
   ```

3. Abre el proyecto en tu IDE (Eclipse, IntelliJ o VS Code con Java Extension Pack).

4. Cambia a la rama correspondiente y ejecuta el ejemplo:
   ```bash
   git checkout feature/estado-runnable
   ```

5. Compila y ejecuta desde consola:
   ```bash
   javac Hilo.java LanzaHilosRunnable.java
   java LanzaHilosRunnable
   ```

---

## 📜 Licencia

- El **código fuente Java** se publica bajo licencia [MIT License](LICENSE).  
- El **contenido educativo y visual (HTML, texto, diagramas)** se publica bajo licencia [CC BY-NC-SA 4.0](LICENSE_DOCS).

---

## 🧠 Créditos

Creado por **profeInformatica101**  
📍 IES Camas — Departamento de Informática  
💡 Enfoque didáctico para el aprendizaje de la concurrencia en entornos reales.
