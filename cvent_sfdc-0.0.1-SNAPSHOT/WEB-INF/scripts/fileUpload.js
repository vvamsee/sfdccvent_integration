function myFunction(){
    var myfile = document.getElementById("myfile");
    var txt = "";
    if ('files' in myfile) {
        if (myfile.files.length == 0) {
            txt = "Select one or more files.";
        } else {
            for (var i = 0; i < myfile.files.length; i++) {
                txt += "<br><strong>" + (i+1) + ". file</strong><br>";
                var file = myfile.files[i];
                if ('name' in file) {
                    txt += "name: " + file.name + "<br>";
                }
                if ('size' in file) {
                    txt += "size: " + file.size + " bytes <br>";
                }
                
            }
        }
    } 
    else {
        if (myfile.value == "") {
            txt += "Select one or more files.";
        } else {
            txt += "The files property is not supported by your browser!";
            txt  += "<br>The path of the selected file: " + myfile.value; // If the browser does not support the files property, it will return the path of the selected file instead. 
        }
    }
    document.getElementById("demo").innerHTML = txt;
}

function fileUpload(){
	if(myfile.value != "")
		 var pathUrl=   "";
		 var json = "";
		 	var formData = new FormData(this);
		 	
		 	for (i = 0; i < myfile.length; i++) { 
		 		formData.append('file',myfile);
		 	}
		  pathUrl = "/gae/pdfFileUpload";
	      json ={
	    		"file":myfile
	    		 }
      	  $.ajax({
   		    url:  pathUrl,
   		    type: 'POST',
   		    dataType: 'json',
   		    data: JSON.stringify(json),
   		    contentType: 'application/json',
   		    mimeType: 'application/json',
   		    success: function(data) {
   		    	alert('Data saved successfully!', ' Ok ');
   		    	
   		    },
   		    error:function(data,status,er) {
   		    	alert("error: "+data+" status: "+status+" er:"+er," Ok ");
   		    }
   		});
	}
	

