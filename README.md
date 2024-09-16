# Music Application

## Build and Run the Application

Follow these steps to build, test, and run the Music application.

### 1. Build the Project with Maven

To build the project, use Maven:

```bash
mvn clean install
```

### 2. Copy the Environment Variables File

Copy the `.env.example` file to `.env` and update the environment variables as needed.

```bash
cp .env.example .env
```

### 3. build the docker image

```bash
docker compose build
```

### 4. After That 

```bash
docker compose up -d
```
### 5. Access the Application

Open your web browser and navigate to `http://localhost:8080` to access the Music application.


if they are any issues, please run the following command after creating the jar file

```bash
cd target
chmod +rx music-0.0.1-SNAPSHOT.jar
java -jar target/music-0.0.1-SNAPSHOT.jar
```





