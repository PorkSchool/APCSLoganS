# Superhero class represents the facts related to a superhero.
class Superhero:
    def __init__(self, _name = "", _strengthPts = 0, _speed =0, _accuracy=0):
        
        # Create a new Superhero with a name and other attributes.

        self.name = _name
        self.strengthPts = _strengthPts

        self.speed = _speed
        seld.accuracy = _accuracy

    def addStrengthPts(self, points):
        # Adds points to the superhero's strength.
        self.strengthPts = self.strengthPts + points

    def slowDown(self, decVal):
        self.speed -=decVal
    
    def addAccuracy(self, val):
        self.accuracy += val
    


def main():
    speedyBoy = Superhero("Speedy Boy", 10,3000,50)
    speedyBoy.addAccuracy(50)
    speedyBoy.slowDown(20)

