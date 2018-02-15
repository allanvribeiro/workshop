function ativarNavegacaoLogin(){
	document.getElementById("home-nav").classList.remove("active");
	document.getElementById("login-nav").classList.add("active");
	document.getElementById("cadastro-nav").classList.remove("active");
}

function ativarNavegacaoHome(){
	document.getElementById("home-nav").classList.add("active");
	document.getElementById("login-nav").classList.remove("active");
	document.getElementById("cadastro-nav").classList.remove("active");
}

function ativarNavegacaoCadastro(){
	document.getElementById("home-nav").classList.remove("active");
	document.getElementById("login-nav").classList.remove("active");
	document.getElementById("cadastro-nav").classList.add("active");
}