import serial
import time
import pyrebase

config = {
  "apiKey": "apiKey",
  "authDomain": "projectId.firebaseapp.com",
  "databaseURL": "https://databaseName.firebaseio.com",
  "storageBucket": "projectId.appspot.com",
 }

firebase = pyrebase.initialize_app(config)
db = firebase.database()

s = serial.Serial('COM3', 115200)
while True:
    res = s.readline()
    print(res)
    time.sleep(1)
    db.child("users").child("Temp and Light").set(str(res))
    
