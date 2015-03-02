#Scarlsen - Scala Chess Engine 

_Named after the current number one Magnus Carlsen - no affiliation_

##Scope: 6 months to write a Chess Engine in Scala

##Goal
> "To build a chess engine in Scala using the foundations and principles of chess engine theory that's been built up over the last 40 years or so. Also, partially an opportunity for me to try out Scala as a language and see how truly efficient it is in the domain of highly CPU intensive operations"

##Resources

[StackOverflow Thread](http://stackoverflow.com/questions/494721/what-are-some-good-resources-for-writing-a-chess-engine)

[Chess Programming Wiki](http://chessprogramming.wikispaces.com/)

[Chess Programming Part 1 - Getting Started](http://www.gamedev.net/page/resources/_/technical/artificial-intelligence/chess-programming-part-i-getting-started-r1014)

[Chess Programming Part 2 - Data Structures](http://www.gamedev.net/page/resources/_/technical/artificial-intelligence/chess-programming-part-ii-data-structures-r1046)

[Chess Programming Part 3 - Move Generation](http://www.gamedev.net/page/resources/_/technical/artificial-intelligence/chess-programming-part-iii-move-generation-r1126)

[Chess Programming Part 4 - Basic Search](http://www.gamedev.net/page/resources/_/technical/artificial-intelligence/chess-programming-part-iv-basic-search-r1171)

[Chess Programming Part 5 - Advanced Search](http://www.gamedev.net/page/resources/_/technical/artificial-intelligence/chess-programming-part-v-advanced-search-r1197)

[Chess Programming Part 6 - Evaluation Functions](http://www.gamedev.net/page/resources/_/technical/artificial-intelligence/chess-programming-part-vi-evaluation-functions-r1208)

[Alpha Beta Search](http://web.archive.org/web/20080621135220/http://www.cs.mcgill.ca/~cs251/OldCourses/1997/topic11/)

[Game Search](http://web.archive.org/web/20070122035937/http://www.maths.nottingham.ac.uk/personal/anw/G13GT1/compch.html)

[Louis Kessler Chess Links](http://www.lkessler.com/cclinks.shtml)

Book: Chess Skill in Man and Machine - By Peter W. Frey

##What I need to cover
* A way to store a representation of the Game Board in memory
* Rules on determining legal moves
* Technique to choose a move among all legal possibilities
* Ways of comparing moves so it makes an intelligent choice
* User interface

###Board Representation

* 64-bit Bitboards
* Piece centric notation
* 1 bitboard represents each piece type AND colour

* General Bitboard Techniques
* General Setwise Operations
    - Important to understand Set Theory, Union, Exclusive Or, 
* Population Count
* BitScan
* Flipping Mirroring and Rotating
    - Transposition tables 
      * How to create an efficient transposition hash?
        * Generate 12x64 N-bit random numbers (where the transposition table has 2^N entries) and store them in a table. Each random number is associated with a given piece on a given square (i.e., black rook on H4, etc.) An empty square is represented by a null word.
      * Start with a null hash key.
      * Scan the board; when you encounter a piece, XOR its random number to the current hash key. Repeat until the entire board has been examined.
      * Fill Algorithms

###Pattern and Attacks
* Pawn Pattern and Properties
* Knight Pattern
* King Pattern
* Sliding Piece Attacks including rotated and magic bitboards
* Square Attacked By
* X-ray Attacks
* Checks and Pinned Pieces
* Design Principles
* Move Generation Issues

* Bitboard aspects on move generation and static exchange evaluation (SEE).
* Bitboard Serialization
* Pieces versus Directions
* DirGolem
* SEE - The Swap Algorithm
* Attack and Defend Maps
* Miscellaneous

* Backtracking - Eight Queens puzzle with Bitboards
* De Bruijn Sequence Generator
* Quad-Bitboards
* Traversing Subsets of a Set
