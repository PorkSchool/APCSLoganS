# Superhero class represents the facts related to a superhero.
class Superhero:
    def __init__(self, name = "", strengthPts = 0, speed =0, accuracy=0):
        
        # Create a new Superhero with a name and other attributes.

        self.name = name
        self.strengthPts = strengthPts

    def addStrengthPts(self, points):

        # Adds points to the superhero's strength.

        self.strengthPts = self.strengthPts + points


def main():
    speedyBoy = Superhero("Speedy Boy", 10,3000,50)

