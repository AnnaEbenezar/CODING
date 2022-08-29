##popularity_scores = {"c++": 99.7, "c": 96.7, "Java": 97.5,
##                     "Python": 100, "C#": 89.4}
##
##def get_rankings(popularity_scores):
##    return dict(sorted(popularity_scores.items(), key=lambda
##                       score: score[1], reverse=True))
##
##print(get_rankings(popularity_scores))


##class SavingsAccount:
##    def __init__(self, bank_name, acc_name, acc_id,
##                 balance, transaction_history):


class Sale_Item(ABC):

    def __init__(self, start_place, end_place, distance):
        self.start = start_place
        self.end = end_place
        self.distance = distance

class Food(ABC):

    ded __init__(

class Walk(Transportation):

    def __init__(self, start_place, end_place, distance):
        super().__init__(start_place, end_place, distance)

    def find_cost(self):
        cost = 0
        return cost

class Taxi(Transportation):

    def __init__(self, start_place, end_place, distance):
        super().__init__(start_place, end_place, distance)

    def find_cost(self):
        price = 40
        cost = self.distance * price
        return cost

class Train(Transportation):

    def __init__(self, start_place, end_place, distance, station):
        super().__init__(start_place, end_place, distance)
        self.station = station

    def find_cost(self):
        price = 5
        cost = self.station * price
        return cost        
