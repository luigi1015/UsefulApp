Write-Host "Going into UsefulApp directory."
cd UsefulApp

Write-Host "`nCleaning out old build files."
gradle clean

Write-Host "`nBuilding the JAR."
gradle jar

Write-Host "`nRunning the JAR."
java -jar .\build\libs\UsefulApp.jar