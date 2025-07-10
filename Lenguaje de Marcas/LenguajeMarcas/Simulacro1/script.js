function mostrarMensaje(e) {
    if (!usuario.value.trim()) return alert("Por favor ingrese un nombre de usuario"), e.preventDefault();
    if (!correo.value.trim()) return alert("Por favor ingrese un correo electrónico"), e.preventDefault();
    alert("Formulario enviado correctamente");
  }