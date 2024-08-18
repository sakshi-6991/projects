<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            color: #333;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #e74c3c;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>An error occurred</h1>
        <p>We are sorry, but something went wrong. Please try again later.</p>

        <h3>Error Details:</h3>
        <p><strong>Type:</strong> <%= exception.getClass().getName() %></p>
        <p><strong>Message:</strong> <%= exception.getMessage() %></p>

        <h4>Stack Trace:</h4>
        <pre><%= exception.printStackTrace(new java.io.PrintWriter(out)) %></pre>
    </div>
</body>
</html>