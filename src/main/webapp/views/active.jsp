
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
    </head>
    <body>
    
        <div class="login-form">
        <form action="/activeUrl">
          <header><h1>Account Activation FORM</h1></header>  
            <div class="container">
            
            <div class="form-group">
                      <label for="acno">Account Number</label>
                      <input type="text" class="form-control" placeholder="Enter your account number" name="acno">
                    </div>

                    <div class="form-group">
                      <label for="firstName">Name</label>
                      <input type="text" class="form-control" placeholder="Enter your first name" name="name">
                    </div>
         
         
                        <div class="form-group">
                            <label for="password">Password </label>
                            <input type="password" class="form-control" name="password" placeholder="Enter your password" required>
                          </div>
                          
                         
   
             <footer><input type="submit" value="Activate" class="btn">&nbsp;&nbsp;&nbsp;
              <input type="reset" value="Clear" class="btn">
            </footer> </div> 
            </form> </div>            
    </body>
</html>