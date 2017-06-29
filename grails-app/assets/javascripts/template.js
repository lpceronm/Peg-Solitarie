function evaluate(from, to) {




	var fromM = from.substring(1, 3);
	var toM = to.substring(1, 3);



	var res1 = fromM.split("");
	var res2 = toM.split("");
    
	
	var x1 =  parseInt( res1[0] )
	var y1 = parseInt( res1[1] )
	var x2 = parseInt( res2[0] )
	var y2 = parseInt( res2[1] )
    

    if( x1 === x2 ){
       var res = y2 - y1;
       if( res == 2 || res === -2){

             if( res === 2 ){

             	var sum = y1 + 1 
             	
             	var sumstring1 = sum.toString()
             	var sumstring2 = x1.toString()
                var complete = ".b" + sumstring2 + sumstring1;
             	var y = document.querySelectorAll ( complete );
             	if( $( y ).css('background-color') === 'rgb(0, 0, 0)' ){
             		$( y ).css( "background-color","gray" );
             		var y = document.querySelectorAll ( "." + from );
             		$( y ).css( "background-color","gray" );
             		var y = document.querySelectorAll ( "." + to );
             		$( y ).css( "background-color","black" );
             	
             	}	
             
             }else{
             	
                    var sum = y1 - 1 
             	
	             	var sumstring1 = sum.toString()
	             	var sumstring2 = x1.toString()
	                var complete = ".b" + sumstring2 + sumstring1;
	             	var y = document.querySelectorAll ( complete );
	             	if( $( y ).css('background-color') === 'rgb(0, 0, 0)' ){
	             		$( y ).css( "background-color","gray" );
	             		var y = document.querySelectorAll ( "." + from );
	             		$( y ).css( "background-color","gray" );
	             		var y = document.querySelectorAll ( "." + to );
	             		$( y ).css( "background-color","black" );
	             	
	             	}	
             
             }
       }else{
       
       		var y = document.querySelectorAll ( "." + from );
	        $( y ).css( "background-color","black" );
		    
		}
       

    }else if(y1 === y2){

       var res = x2 - x1;
       if( res == 2 || res === -2){

             if( res === 2 ){

             	var sum = x1 + 1 
             	
             	var sumstring1 = sum.toString()
             	var sumstring2 = y1.toString()
                var complete = ".b" + sumstring1 + sumstring2;

             	var y = document.querySelectorAll ( complete );
             	if( $( y ).css('background-color') === 'rgb(0, 0, 0)' ){
             		$( y ).css( "background-color","gray" );
             		var y = document.querySelectorAll ( "." + from );
             		$( y ).css( "background-color","gray" );
             		var y = document.querySelectorAll ( "." + to );
             		$( y ).css( "background-color","black" );        	
             	}	
             
             }else{
             
                    var sum = x1 - 1 
             	
	             	var sumstring1 = sum.toString()
	             	var sumstring2 = y1.toString()
	                var complete = ".b" + sumstring1 + sumstring2;
	             	var y = document.querySelectorAll ( complete );
	             	if( $( y ).css('background-color') === 'rgb(0, 0, 0)' ){
	             		$( y ).css( "background-color","gray" );
	             		var y = document.querySelectorAll ( "." + from );
	             		$( y ).css( "background-color","gray" );
	             		var y = document.querySelectorAll ( "." + to );
	             		$( y ).css( "background-color","black" );
	             	
	             	}	
             
             }
       }else{
       
       		var y = document.querySelectorAll ( "." + from );
	        $( y ).css( "background-color","black" );
		    
		}

   }else{
   
   		var y = document.querySelectorAll ( "." + from );
	    $( y ).css( "background-color","black" );
		    
		    
   }
    
}

function checker(from, to) {

	

    
}







