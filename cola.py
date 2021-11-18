class QueueADT:
  def __init__(self):
    self.__data=[]
  
  def is_empty(self):
    return len(self.__data)==0
  
  def length(self):
    return len(sel.__data)

  def enqueue(self, element):
    self.__data.append(element)

  def dequeue(self, element):
    if not self.is_empty():
      return self .__data.pop(0)

  def to_string(self):
    for element  in self.__data:
      print(f"|{element}|<----", end = " " )
         


