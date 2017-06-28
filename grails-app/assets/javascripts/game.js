 $('#btn').click(function() {
      var id = $(this).attr('id');
      alert(id);
 });
 
  $('#hole').click(function() {
      var id = $(this).attr('identifier');
      alert(id);
 });
 

 
 function btn_click(id) {
    //alert(id);
    var complete = "." + id;
    //alert(complete);
    localStorage.value = "." + id;
    if( localStorage.selected === "None" ){

	    localStorage.selected = id;

	    var x = document.querySelectorAll (
        complete
        );
	    $( x ).css( "background-color","yellow" );
    }else{
    
    	var complete = "." + localStorage.selected;

	    var x = document.querySelectorAll (
        complete
        );
	    $( x ).css( "background-color","gray" );
	    localStorage.selected = "None";
    	
    }

}

 function init() {

    localStorage.selected = "None";

}