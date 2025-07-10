function enviar(e) {
    e.preventDefault();
    const nombre = document.getElementById("nombre").value.trim();
    if (nombre) alert("Bienvenido, " + nombre + "!");
  }
  
  function resetear() {
    // No hace falta código, <form> con botón reset ya borra todo
  }