<html>
    <head>
        <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>create Account</title>
        <style>
            body{
             background: url(img6.jpg); 
             background-size: cover;
            }
            .container{
                background-color:white;
            }
            .btn{
            background-color:rgb(77, 127, 201) ;
            color: aliceblue;
            width: 30%;
            height: 40px; /* Adjust the height as needed */
            padding: 2px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            resize: none;
            padding-right: 30px;
            }
            label{
                color:rgb(77, 127, 201);
                font-weight: bold;
            }
            h1{
                font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
                font-size: 25px;
                text-align: center;
            }
            
            .login-form {
            max-width: 800px;
            margin: 0 auto;
            background-color:transparent;
            padding: 30px;
            border-radius: 4px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            input {
            width: 100%;
            padding: 15px;
            border: 1px solid #131212;
            border-radius: 4px;
            box-sizing: border-box;
        }
        select
        {
          width: 100%;
            padding: 15px;
            border: 1px solid #131212;
            border-radius: 4px;
            box-sizing: border-box;

        }
        
        header,footer {
            background-color:floralwhite;
            color: #0b0a0ae4;
            text-align: center;
            padding: 10px;
        }
        </style>
        <script type="text/javascript">
        function uday()
        {
        	var name=document.js.name.value;
        	
        	var status=false;
        	
        	
        	if(name.length<1){
                document.getElementById("namelocation").innerHTML="please enter your name";
                document.js.name.focus();
                status=false;
            }
            else{
                status=true;
            }
        	
        }
        
        
        </script>
    </head>
    <body>
    
        <div class="login-form">
        <form action="/save" method="POST">
          <header><h1>OPEN ACCOUNT FORM</h1></header>  
            <div class="container">
            
                       <div class="form-group">
                      <label for="acno">Account number</label>
                      <input type="text" class="form-control" placeholder="Enter your account number" name="acno">
                    </div>

                    <div class="form-group">
                      <label for="firstName">Name</label>
                      <input type="text" class="form-control" placeholder="Enter your first name" name="name">
                    </div>
                    
         
         
                        <div class="form-group">
                            <label for="password">Password *</label>
                            <input type="password" class="form-control" name="password" placeholder="Enter your password" required>
                          </div>
                          
                          
                          <div class="form-group">
                            <label for="password">Confirm Password *</label>
                            <input type="password" class="form-control" name="cpassword" placeholder="Enter your confirm password" required>
                          </div>

                         
                  
                <div class="form-group">
                            <label for="amount">Amount:</label>
                            <input type="text" class="form-control"  placeholder="Enter Your amount" name="amount">
                          </div>

             

                <div class="form-group">
                  <label for="address">Address</label>
                  <input type="text" class="form-control" placeholder="Enter Your Address" name="address">
                </div>

                <div class="form-group">
                            <label for="phno">Mobile Number</label>
                            <input type="text" class="form-control" placeholder="Enter Your Mobile Number"  name="mno">
                          </div>
                          
             <footer><input type="submit" value="Create A/C" class="btn">&nbsp;&nbsp;&nbsp;
              <input type="reset" value="Reset" class="btn">
            </footer> </div> 
            </form> </div>            
    </body>
</html>