package org.Sport;

public class Main {
    public static void main(String[] args) {

        Sport ballSport1 = Sport.FOOTBALL;
        Sport ballSport2 = Sport.BASKETBALL;
        Sport ballSport3 = Sport.RUGBY;
        Sport motorSport = Sport.F1;
        Sport batAndBallSport = Sport.CRICKET;
        Sport racketSport = Sport.TENNIS;
        Sport clubAndBallSport = Sport.GOLF;
        Sport trackandFieldSport = Sport.ATHLETICS;

        Sport sport = Sport.RUGBY;
//sport == Sport.FOOTBALL|| sport == Sport.BASKETBALL ||

        if (sport == Sport.RUGBY) {
            System.out.println("We are playing Rugby!");
        }
        else System.out.println("We are playing either F1, Football, Basketball, Tennis, Athletics, Golf or Cricket but NOT Rugby.");

switch (sport){
    case F1:
        System.out.println("We are playing a Motorsport!");
        break;

    case FOOTBALL:
        System.out.println("We are playing a Ball Sport!");
        break;

    case BASKETBALL:
        System.out.println("We are playing another Ball Sport!");
        break;

    case RUGBY:
        System.out.println("We are playing yet another Ball Sport!");
        break;

    case TENNIS:
        System.out.println("We are playing a Racket Sport!");
        break;

    case ATHLETICS:
        System.out.println("We are playing a Track and Field Sport!");
        break;

    case GOLF:
        System.out.println("We are playing a Club and Ball Sport!");
        break;

    case CRICKET:
        System.out.println("We are playing a Bat and Ball Sport!");
        break;

    default:
        System.out.println("I do not recognise this sport or type.");
}
    }
}