# utils.py

import time

mouseX = None
mouseY = None

def onClick(event):
    global mouseX, mouseY
    mouseX, mouseY = event.x, event.y

def getMouse(canvas):
    global mouseX, mouseY
    canvas.update()
    mouseX = None
    mouseY = None
    while mouseX is None:
        time.sleep(0.1)
        canvas.update()
    return (mouseX, mouseY)
