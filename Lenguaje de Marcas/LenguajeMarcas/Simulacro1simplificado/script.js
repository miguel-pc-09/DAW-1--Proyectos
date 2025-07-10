function mostrarMensaje(e) {
    if (!usuario.value.trim()) return alert("Ingrese un nombre de usuario"), e.preventDefault();
    if (!correo.value.trim()) return alert("Ingrese un correo electrónico"), e.preventDefault();
    alert("Formulario enviado correctamente");
  }