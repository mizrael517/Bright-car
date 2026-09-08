Digital ID Photo Booth – Project Explanation

Good day everyone! My mini project is called Digital ID Photo Booth. This web application uses three important browser features: localStorage, getUserMedia(), and HTML Canvas.

First, I used localStorage for the theme feature. The user can switch between Light Mode and Dark Mode. When the user selects a theme, JavaScript saves the theme using localStorage.setItem(). When the page is opened again, localStorage.getItem() reads the saved theme and applies it automatically. This allows the theme preference to remain even after refreshing the page.

Second, I used the getUserMedia() API to access the device camera. When the user clicks the Start Camera button, the browser asks for camera permission. Once permission is granted, the camera stream is connected to the <video> element using video.srcObject. This displays the live camera feed on the webpage.

Third, I used HTML Canvas to capture a photo. I get the canvas drawing area using canvas.getContext("2d"). Then, I use the drawImage() function to copy the current video frame onto the canvas. The canvas image is converted into a PNG image using toDataURL(), and the resulting picture is displayed on the Digital ID card.

The user can also enter their name and course, which are displayed on the digital ID after clicking the Update ID button.

Overall, this project demonstrates how JavaScript can interact with browser APIs to create an interactive web application using client-side storage, camera access, and canvas image processing.

For your screen recording, show these parts while explaining:

🌙 Click Dark Mode → refresh the page → show that the theme stays.
📷 Click Start Camera → show the live camera feed.
📸 Click Take Snapshot → show the captured image.
🎓 Enter your name/course → click Update ID → show the Digital ID.