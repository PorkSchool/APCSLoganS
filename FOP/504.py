#Logan Santamarina 1/18/23 Superhero creotr and outputter


# Superhero class represents the facts related to a superhero.
class Superhero:
    def __init__(self, _name = "", _strengthPts = 0, _speed =0, _accuracy=0):
        
        # Create a new Superhero with a name and other attributes.

        self.name = _name
        self.strengthPts = _strengthPts

        self.speed = _speed
        self.accuracy = _accuracy

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

    paragraph = f"{speedyBoy.name} is an incredible superhero known for his extraordinary abilities. Possessing the powers of accuracy {speedyBoy.accuracy}, strength {speedyBoy.strengthPts}, and speed {speedyBoy.speed}, he is a force to be reckoned with. Whether it's lifting heavy objects with unmatched strength {speedyBoy.strengthPts}, zooming through the city with incredible speed {speedyBoy.speed}, or hitting targets with pinpoint accuracy {speedyBoy.accuracy}, SpeedyBoy is always ready to save the day. His unique combination of strength, speed, and accuracy makes him a true guardian of justice and a symbol of heroism in the city."

    print(paragraph)
main()