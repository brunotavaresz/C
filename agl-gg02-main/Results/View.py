import tkinter as tk
from tkinter import *
import time, os, sys
from Types import *
from utils import *

class View:
    def __init__(self,Ox=0,Oy=0,width=801,height=801,title="No title",background="black",canvas=None,root=None):
        
        self.Ox=Ox
        self.Oy=Oy
        self.width=width
        self.height=height
        self.title=title
        self.background=background
        self.click_coords=None
        self.canvas=canvas

        
        # self.canvas=Canvas(root, background=self.background,width= self.width,height= self.height)
        # self.canvas.pack()
        # self.canvas.config(scrollregion=(-self.width//2, -self.height//2,self.width//2, self.height//2))
        root.title(self.title)
        self.canvas.config(background=self.background,width= self.width,height= self.height) 
        self.canvas.config(scrollregion=(-self.width//2, -self.height//2,(self.width//2), (self.height//2)))
         
        self.scrollView=  [self.width//2, self.height//2,(self.width//2), (self.height//2)]
        # self.canvas.xview_moveto(-self.width//2/-self.width//2*4)
        # self.canvas.yview_moveto(-self.height//2/-self.height//2*4)


    
    def refresh(self,time=0):
        self.canvas.after(time,self.canvas.update())
    
    def move(self,object, cordinates:tuple=None):
        self.canvas.move(object, cordinates[0], cordinates[1])
    
    def moveView(self, coords:tuple):
        self.scrollView[2]+=coords[0]
        self.scrollView[3]+=coords[1]
        self.canvas.config(scrollregion=(self.scrollView[0], self.scrollView[1],self.scrollView[2], self.scrollView[3]))
        




        

