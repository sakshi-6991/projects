<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey Submission</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="form-container">
        <h1>Thank You for Your Submission!</h1>
        <p>Your survey responses have been recorded.</p>

        <h2>Your Details</h2>
        <p><strong>Name:</strong> <%= request.getParameter("name") %></p>
        <p><strong>Email:</strong> <%= request.getParameter("email") %></p>
        <p><strong>Age:</strong> <%= request.getParameter("age") %></p>
        <p><strong>Gender:</strong> <%= request.getParameter("gender") %></p>
        <p><strong>Satisfaction:</strong> <%= request.getParameter("satisfaction") %></p>
        <p><strong>Comments:</strong> <%= request.getParameter("comments") %></p>
    </div>
</body>
</html>