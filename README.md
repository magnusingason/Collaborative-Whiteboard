# Collaborative-Whiteboard

*    When a user draws on the whiteboard, the client sends a message to the server over the WebSocket connection. The message should contain the coordinates of the drawing, the color of the drawing, and any other relevant information.
*    The server receives the message and updates the state of the whiteboard. The server should keep track of all the drawings on the whiteboard and their associated metadata (e.g., color, stroke width).
*    The server broadcasts the updated state of the whiteboard to all connected clients over the WebSocket connection. Each client receives the message and updates its local copy of the whiteboard to reflect the changes.
*    When a new user joins the whiteboard, the server sends the current state of the whiteboard to the new user over the WebSocket connection. This ensures that the new user sees the same whiteboard as the other users.
*    If a user disconnects from the whiteboard, the server should remove the user's drawings from the state of the whiteboard and broadcast the updated state to all connected clients.  
*    By implementing these steps, multiple users can collaborate on the same whiteboard in real-time. Users can see each other's drawings as they are being made, and the state of the whiteboard is always up-to-date for all users.
