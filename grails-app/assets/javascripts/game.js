$('#btn').click(function() {
      var id = $(this).attr('id');
      alert(id);
 });
 
  $('#hole').click(function() {
      var id = $(this).attr('identifier');
      alert(id);
 });
 

function btn_click(id) {

    var complete = "." + id;
    localStorage.value = "." + id;
    var y = document.querySelectorAll ( complete );

    if(  localStorage.selected === "None" && $( y ).css('background-color') === 'rgb(0, 0, 0)' ){
	    localStorage.selected = id;
	    var x = document.querySelectorAll ( complete  );
	    $( x ).css( "background-color","yellow" );
    }else{
      	
    	if( $( y ).css('background-color') === 'rgb(128, 128, 128)'){ 
    		//Connection
    		//alert("entro a connection");
    		back(localStorage.selected,id);
    		evaluate( localStorage.selected,id );   
	    	//var complete = "." + localStorage.selected;
		    //var x = document.querySelectorAll ( complete  );
		    //$( x ).css( "background-color","gray" );
		    localStorage.selected = "None";
    	}
    	var complete = "." + localStorage.selected;
	    var x = document.querySelectorAll ( complete );
	    $( x ).css( "background-color","black" );
	    localStorage.selected = "None";	

    }
}


function init() {

    localStorage.selected = "None";
    localStorage.score = 0;
    localStorage.pegs = 6;
    localStorage.record = ""; 
    localStorage.report = ""; 
    
}

$('#change').click(function() {
      
      $( '.b31' ).css( "background-color","black" );
      $( '.b32' ).css( "background-color","black" );
      $( '.b34' ).css( "background-color","black" );
      $( '.b35' ).css( "background-color","black" );
      $( '.b40' ).css( "background-color","black" );
      $( '.b41' ).css( "background-color","black" );
      $( '.b42' ).css( "background-color","black" );
      $( '.b43' ).css( "background-color","black" );
      $( '.b44' ).css( "background-color","black" );
      $( '.b45' ).css( "background-color","black" );
      $( '.b46' ).css( "background-color","black" );
      localStorage.pegs = 16;
      
      
      
 });
 

function history() {

    var div = document.getElementById('valid');

	div.innerHTML = div.innerHTML + "<h4>" + localStorage.fr + "->" +  localStorage.last + "</h4>";


}

function undoHistory() {

    var div2 = document.getElementById('valid');


	div2.innerHTML = div2.innerHTML + "<h4 style='color:red'>" + localStorage.fr + "<-" +  localStorage.last + "</h4>";

	
	
}
