fun main() {
    var playerScore = 0
    var computerScore = 0
    var playerChoice = 0
    var computerChoice = 0

    val targetScore = 5

    while(true) {
        if(playerScore == targetScore) {
            println("PLAYER WIN THE GAME!\n")
            break
        } else if(computerScore == targetScore) {
            println("COMPUTER WIN THE GAME!\n")
            break
        }
        println("Welcome to Rock, Paper, Scissor!")
        println("Enter \"1\" to select Rock, \"2\" to select Paper, \"3\" to select Scissor!")
        print("Enter you choice: ")
        playerChoice = readln().toInt()
        if(playerChoice < 1 || playerChoice > 3) {
            continue
        }
        computerChoice = (1..3).random()

        // Player as Rock
        if(playerChoice == 1 && computerChoice == 1) {
            println("Draw!\n")
            continue
        } else if(playerChoice == 1 && computerChoice == 2) {
            println("Player: " + getChoice(playerChoice) + " vs Computer: " + getChoice(computerChoice))
            computerScore += 1
            println("Computer WIN!\nPlayer = $playerScore \nComputer = $computerScore \n")
            continue
        } else if(playerChoice == 1 && computerChoice == 3) {
            println("Player: " + getChoice(playerChoice) + " vs Computer: " + getChoice(computerChoice))
            playerScore += 1
            println("Player WIN!\nPlayer = $playerScore \nComputer = $computerScore \n")
            continue
        }

        // Player as Paper
        if(playerChoice == 2 && computerChoice == 1) {
            println("Player: " + getChoice(playerChoice) + " vs Computer: " + getChoice(computerChoice))
            playerScore += 1
            println("Player WIN!\nPlayer = $playerScore \nComputer = $computerScore \n")
            continue
        } else if(playerChoice == 2 && computerChoice == 2) {
            println("Draw!\n")
            continue
        } else if(playerChoice == 2 && computerChoice == 3) {
            println("Player: " + getChoice(playerChoice) + " vs Computer: " + getChoice(computerChoice))
            computerScore += 1
            println("Computer WIN!\nPlayer = $playerScore \nComputer = $computerScore \n")
            continue
        }

        // Player as Paper
        if(playerChoice == 3 && computerChoice == 1) {
            println("Player: " + getChoice(playerChoice) + " vs Computer: " + getChoice(computerChoice))
            computerScore += 1
            println("Computer WIN!\nPlayer = $playerScore \nComputer = $computerScore \n")
            continue

        } else if(playerChoice == 3 && computerChoice == 2) {
            println("Player: " + getChoice(playerChoice) + " vs Computer: " + getChoice(computerChoice))
            playerScore += 1
            println("Player WIN!\nPlayer = $playerScore \nComputer = $computerScore \n")
            continue
        } else if(playerChoice == 3 && computerChoice == 3) {
            println("Draw!\n")
            continue
        }
    }
}

fun getChoice(choice: Int): String {
    if(choice == 1) {
        return "Rock"
    } else if(choice == 2) {
        return "Paper"
    } else if(choice == 3) {
        return "Scissor"
    } else {
        return "invalid"
    }
}