<h1 align="center">FitGuide - Fitness & Health Management</h1>

<p>
  FitGuide is a full-stack web application designed to help users track their fitness goals, manage workout plans, and monitor their health progress. 
  The platform enables users to create personalized fitness plans, log daily workouts, track nutrition, and receive AI-driven fitness recommendations.
</p>

<p>
  <b align="center">Features</b><br>
  - Secure login and registration for users using Spring Security and JWT.<br>
  - Personalized workout and diet plans based on user preferences.<br>
  - Users can log daily workouts and track progress over time.<br>
  - AI-driven fitness recommendations for better health outcomes.<br>
  - Integration with wearable devices for real-time health tracking.<br>
  - Calorie and nutrition tracking with food database integration.<br>
  - Community forums for users to interact and share fitness tips.<br>
  - Admin panel to manage workout plans, users, and analytics.<br>
</p>

<p>
  <b align="center">Tech Stack</b><br>
  - <b>Frontend:</b> React.js, Bootstrap for UI components.<br>
  - <b>Backend:</b> Spring Boot, RESTful APIs, JWT Authentication.<br>
  - <b>Database:</b> MySQL.<br>
  - <b>AI & Analytics:</b> Machine Learning-based fitness insights.<br>
</p>

<p>
  <b align="center">Setup Instructions</b><br>
  - <b>Prerequisites:</b> Node.js and npm installed, Java (JDK 11 or above) installed, MySQL installed and running.<br>
  - Clone the repository: <code>git clone https://github.com/yourusername/fitguide.git</code><br>
  - Navigate to the backend directory: <code>cd fitguide/backend</code><br>
  - Configure the database in <code>application.properties</code>.<br>
  - Build and run the Spring Boot application: <code>mvn spring-boot:run</code><br>
  - Navigate to the frontend directory: <code>cd fitguide/frontend</code><br>
  - Install dependencies: <code>npm install</code><br>
  - Start the development server: <code>npm start</code><br>
</p>

<p>
  <b align="center">Backend API Endpoints</b><br>
  - <b>/auth/register</b> (POST) - Register a new user.<br>
  - <b>/auth/login</b> (POST) - User login.<br>
  - <b>/workouts</b> (GET) - Get all workout plans.<br>
  - <b>/workouts/log</b> (POST) - Log workout data.<br>
  - <b>/nutrition/track</b> (POST) - Log daily nutrition intake.<br>
  - <b>/recommendations</b> (GET) - Get AI-driven fitness recommendations.<br>
  - <b>/community/posts</b> (POST) - Create a new post in the community.<br>
</p>

<p>
  <b align="center">Frontend UI</b><br>
  - Home Page: Displays available fitness plans and user dashboard.<br>
  - Login/Register Page: User authentication.<br>
  - Workout Tracker: Log and track workouts.<br>
  - Nutrition Tracker: Track daily calorie intake.<br>
  - Community Page: Interact with other fitness enthusiasts.<br>
</p>

<p>
  <b align="center">Development Workflow</b><br>
  - <b>Frontend Development:</b> Built using Bootstrap for responsiveness, developed interactive fitness tracking, and integrated React components with backend APIs.<br>
  - <b>Backend Development:</b> Implemented RESTful APIs using Spring Boot, handled user data securely, and integrated AI-driven fitness insights.<br>
</p>

<p>
  <b align="center">Copyright</b><br>
  @2025 Kaushal B. Kadam<br>
</p>
