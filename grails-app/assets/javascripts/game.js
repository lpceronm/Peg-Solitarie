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
    var y = document.querySelectorAll (
     complete
    );


    if(  localStorage.selected === "None" && $( y ).css('background-color') === 'rgb(0, 0, 0)' ){

	    localStorage.selected = id;

	    var x = document.querySelectorAll (
        complete
        );
	    $( x ).css( "background-color","yellow" );
    }else{
    
    	//Connection
    	
    	
    	//var newData = ${remoteFunction(controller: 'my', action: 'updateData', params: '["Holaaa"]')};
    
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