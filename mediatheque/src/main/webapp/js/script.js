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

PrimeFaces.locales['pt'] = {  
        closeText: 'Fechar',  
        prevText: 'Anterior',  
        nextText: 'Próximo',  
        currentText: 'Início',  
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],  
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun', 'Jul','Ago','Set','Out','Nov','Dez'],  
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],  
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb'],  
        dayNamesMin: ['D','S','T','Q','Q','S','S'],  
        weekHeader: 'Semana',  
        firstDay: 0,  
        isRTL: false,  
        showMonthAfterYear: false,  
        yearSuffix: '',  
        timeOnlyTitle: 'Só Horas',  
        timeText: 'Tempo',  
        hourText: 'Hora',  
        minuteText: 'Minuto',  
        secondText: 'Segundo',  
        currentText: 'Data Atual',  
        ampm: false,  
        month: 'Mês',  
        week: 'Semana',  
        day: 'Dia',  
        allDayText : 'Todo Dia'  
    };