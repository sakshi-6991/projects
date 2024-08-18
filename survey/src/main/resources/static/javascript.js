document.getElementById("surveyForm").addEventListener("submit", function(event) {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const age = document.getElementById("age").value;

    if (!name || !email || !age) {
        alert("Please fill out all required fields.");
        event.preventDefault(); // Prevent form submission
    }
});