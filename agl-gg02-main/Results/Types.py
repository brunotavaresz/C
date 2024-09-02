import View
import random

class Rectangle(object):
    def __init__(self,center=(0,0),length=(0,0),fill="black",state="normal",canvas=None):
        self.center=center
        self.length=length
        self.View=View
        self.fill=fill
        self.state=state
        self.canvas=canvas
        Rectangle.rectangle_create(self)

    def rectangle_create(self):
        self.object=self.canvas.create_line( Rectangle.converter(self.center,self.length) , fill=self.fill,state=self.state)
    
    def converter(center:tuple,length:tuple):
        return center[0]-length[0],center[1]-length[1],center[0]+length[0],center[1]-length[1],center[0]+length[0],center[1]+length[1],center[0]-length[0],center[1]+length[1],center[0]-length[0],center[1]-length[1]
        

        
        
class Line:
    def __init__(self,center=(0,0),length=(0,0),fill="black",state="normal",canvas=None):
        self.center=center
        self.length=length
        self.canvas=canvas
        self.fill=fill
        self.state=state
        Line.line_create(self)
        
    def line_create(self):
        self.object =self.view.canvas.create_line( Line.converter(self.center,self.tuple), fill=self.fill,state=self.state)  
        
    def converter(center:tuple,length:tuple):
        return center[0],center[1],center[0]+length[0],center[1]-length[1]
    
class Ellipse:
    def __init__(self,center=(0,0),length=(0,0),fill="black",state="normal",canvas=None):
        self.center=center
        self.length=length
        self.canvas=canvas
        self.fill=fill
        self.state=state
        Ellipse.ellipse_create(self)
        
    def ellipse_create(self):
        self.object =self.canvas.create_oval( Ellipse.converter(self.center,self.length) , fill=self.fill,state=self.state)
    
    def converter(center:tuple,length:tuple):
        return center[0]-length[0],center[1]-length[1],center[0]+length[0],center[1]+length[1]
        
class Arc:
    def __init__(self,center=(0,0),length=(0,0),fill="black",start=0,extent=0,state="normal",outline="black" ,canvas=None):
        self.center=center
        self.length=length
        self.start=start
        self.extent=extent
        self.fill=fill
        self.outline=outline
        self.state=state
        self.canvas=canvas
        Arc.arc_create(self)
        
    def arc_create(self):
        self.object =self.canvas.create_arc( Arc.converter(self.center,self.length), start=self.start, extent=self.extent, fill=self.fill,state=self.state)
    
    def converter(center:tuple,length:tuple):
        return center[0]-length[0],center[1]-length[1],center[0]+length[0],center[1]+length[1]
    
   
        
        
        
class ArcChord:
    def __init__(self,center=(0,0),length=(0,0),fill="black",start=0,extent=0,state="normal",outline="black" ,canvas=None):
        self.center=center
        self.length=length
        self.start=start
        self.extent=extent
        self.fill=fill
        self.outline=outline
        self.canvas=canvas
        self.state=state
        ArcChord.arcchord_create(self)
        
    def arcchord_create(self):
        self.object =self.canvas.create_arc( ArcChord.converter(self.center,self.length) , start=self.start, extent=self.extent, fill=self.fill,state=self.state)
    
    def converter(center:tuple,length:tuple):
        return center[0]-length[0],center[1]-length[1],center[0]+length[0],center[1]+length[1]
    
class PieSlice:
    def __init__(self,center=(0,0),length=(0,0),fill="black",start=0,extent=0,state="normal",outline="black" ,canvas=None):
        self.center=center
        self.length=length
        self.start=start
        self.extent=extent
        self.fill=fill
        self.state=state
        self.outline=outline
        self.canvas=canvas
        PieSlice.pieslice_create(self)
        
    def pieslice_create(self):
        self.object =self.canvas.create_arc( PieSlice.converter(self.center,self.length), start=self.start, extent=self.extent, fill=self.fill,state=self.state)
        
    def converter(center:tuple,length:tuple):
        return center[0]-length[0],center[1]-length[1],center[0]+length[0],center[1]+length[1]

        

class Text:
    def __init__(self,center=(0,0),text="",fill="black",state="normal",canvas=None):
        self.center=center
        self.text=text
        self.fill=fill
        self.state=state
        self.canvas=canvas
        Text.text_create(self)
        
    def text_create(self):
        self.object =self.canvas.create_text( self.center, text=self.text, fill=self.fill,state=self.state)
    


class Dot:
    def __init__(self,center=(0,0),fill="black",state="normal",canvas=None):
        self.center=center
        self.fill=fill
        self.state=state
        self.canvas=canvas
        Dot.dot_create(self)
        
    def dot_create(self):
        self.object =self.canvas.create_rectangle(Dot.converter(self.center) , fill=self.fill,state=self.state)
    
    def converter(center:tuple):
        return center[0],center[1],center[0],center[1]

class Point:
    def __init__(self,x=0,y=0):
        self.x=x
        self.y=y
        self.value=(x,y)
        
class Vector:
    def __init__(self,x=0,y=0):
        self.x=x
        self.y=y
        self.value=x,y

class Time:
    def __init__(self,String:str):
        num = int(String[:-2])
        unit = String[-2]
        if unit == "m":
            self.time= num
        else:
            self.time= int(String[:-1]) * 1000
            
class PolyLine:
    def __init__(self,center,canvas,fill, **kwargs) -> None:
        points = [center]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        self.points = points
        self.canvas = canvas
        self.kwargs = kwargs
        self.fill=fill
        PolyLine.polyline_create(self)
    
    def polyline_create(self):
        flattened_points = [coord for point in self.points for coord in point]
        self.object=self.canvas.create_line(flattened_points,fill=self.fill)
    
    def converter(center:tuple,fill=None,**kwargs):
        points=[]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        return center[0],center[1],*points
    
class Spline:
    def __init__(self,center,canvas,fill, **kwargs) -> None:
        points = [center]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        self.points = points
        self.canvas = canvas
        self.kwargs = kwargs
        self.fill=fill
        Spline.spline_create(self)
    
    def spline_create(self):
        flattened_points = [coord for point in self.points for coord in point]
        self.object=self.canvas.create_line(flattened_points,fill=self.fill,smooth=True)
    
    def converter(center:tuple,fill=None,**kwargs):
        points=[]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        return center[0],center[1],*points

class Polygon:
    def __init__(self,center,canvas,fill, **kwargs) -> None:
        points = [center]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        self.points = points
        self.canvas = canvas
        self.kwargs = kwargs
        self.fill=fill
        Polygon.polygone_create(self)
    
    def polygone_create(self):
        flattened_points = [coord for point in self.points for coord in point]
        self.object=self.canvas.create_polygon(flattened_points,fill=self.fill)
    
    def converter(center:tuple,fill=None,**kwargs):
        points=[]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        return center[0],center[1],*points

class Blob:
   
    def __init__(self,center,canvas,fill, **kwargs) -> None:
        points = [center]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        self.points = points
        self.canvas = canvas
        self.kwargs = kwargs
        self.fill=fill
        Blob.Blob_create(self)
    
    def Blob_create(self):
        flattened_points = [coord for point in self.points for coord in point]
        self.object=self.canvas.create_polygon(flattened_points,fill=self.fill,smooth=True)
    
    def converter(center:tuple,fill=None,**kwargs):
        points=[]
        for key in kwargs:
            if key.startswith("point"):
                points.append(kwargs[key])
        return center[0],center[1],*points
        

    
    
        
        
    
    