// Función para mostrar u ocultar la contraseña
function mostrarOcultar(idCampo, boton) {
    const input = document.getElementById(idCampo); // Se obtiene el input correspondiente por su ID
    if (input.type === "password") {
        input.type = "text";                       // Si está en modo contraseña, se cambia a texto
        boton.textContent = "Ocultar";             // Se cambia el texto del botón
    } else {
        input.type = "password";                   // Si ya está en texto, se vuelve a contraseña
        boton.textContent = "Mostrar";             // Se actualiza el texto del botón
    }
}

// Espera a que todo el documento esté cargado
document.addEventListener("DOMContentLoaded", () => {
    let campoActivo = null;                      // Guardará el input de contraseña que está activo
    let mayusculas = true;                       // Controla si el teclado está en modo mayúsculas

    // Detecta cuando el usuario hace clic en el campo de contraseña o confirmar
    document.getElementById("contrasena").addEventListener("focus", () => campoActivo = document.getElementById("contrasena"));
    document.getElementById("confirmar").addEventListener("focus", () => campoActivo = document.getElementById("confirmar"));

    const teclas = "1234567890QWERTYUIOPASDFGHJKLZXCVBNM@.-←";     // Lista de caracteres del teclado
    const teclado = document.getElementById("teclado");            // Elemento contenedor del teclado virtual

    // Crea el botón de Mayús
    const btnMayus = document.createElement("button");            // Crea el botón
    btnMayus.classList.add("tecla");                              // Añade la clase CSS
    btnMayus.textContent = "Mayús";                               // Texto del botón
    btnMayus.addEventListener("click", (e) => {
        e.preventDefault();                                       // Evita que el botón envíe un formulario
        mayusculas = !mayusculas;                                 // Cambia el estado de mayúsculas a minúsculas o viceversa
        actualizarTeclado();                                      // Regenera el teclado con el nuevo estado
    });
    teclado.appendChild(btnMayus);                                // Añade el botón Mayús al contenedor del teclado

    // Función que actualiza las teclas en pantalla
    function actualizarTeclado() {
        // Elimina todas las teclas anteriores excepto el botón Mayús
        teclado.querySelectorAll(".tecla").forEach(btn => {
            if (btn !== btnMayus) {
                btn.remove();
            }
        });

        // Recorre cada carácter y crea un botón correspondiente
        for (let tecla of teclas) {
            // Convierte a minúscula si es una letra y el estado lo requiere
            let mostrar = /[A-Z]/.test(tecla) ? (mayusculas ? tecla : tecla.toLowerCase()) : tecla;

            const btn = document.createElement("button");        // Crea un botón por cada tecla
            btn.classList.add("tecla");                          // Le aplica el estilo CSS
            btn.textContent = mostrar;                           // Muestra el carácter correspondiente

            // Evento al hacer clic en una tecla
            btn.addEventListener("click", (e) => {
                e.preventDefault();                              // Evita que se envíe el formulario
                if (campoActivo) {                               // Si hay un campo activo (contraseña o confirmar)
                    if (tecla === "←") {
                        campoActivo.value = campoActivo.value.slice(0, -1);  // Borra el último carácter
                    } else {
                        campoActivo.value += mostrar;                        // Añade el carácter al input
                    }
                }
            });

            teclado.appendChild(btn);                                        // Añade la tecla al contenedor del teclado
        }
    }

    actualizarTeclado();                                          // Inicializa el teclado al cargar la página

    // Validación del formulario al hacer clic en Registrarse
    document.getElementById("formulario").addEventListener("submit", (e) => {
        e.preventDefault();                                       // Evita que el formulario se envíe de verdad

        // Captura los valores de los campos
        const nombre = document.getElementById("nombre").value.trim();
        const correo = document.getElementById("correo").value.trim();
        const pass1 = document.getElementById("contrasena").value;
        const pass2 = document.getElementById("confirmar").value;

        // Verifica que todos los campos estén rellenos
        if (!nombre || !correo || !pass1 || !pass2) {
            alert("Por favor, rellena todos los campos.");
            return;
        }

        // Verifica que las contraseñas coincidan
        if (pass1 !== pass2) {
            alert("Las contraseñas no coinciden.");
            return;
        }

        // Si todo está bien, muestra mensaje de bienvenida
        alert(`Registro exitoso. Bienvenido, ${nombre}`);
    });
});
