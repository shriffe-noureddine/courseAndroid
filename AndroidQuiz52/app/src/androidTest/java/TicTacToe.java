public class TicTacToe

{

    static    private final     int        COMP_WIN    =    10;
    static    private final     int        HUMAN_WIN    =    -10;
    static    private final     int        DRAW        =    0;

    static    private int        move    =    0;    //    used to return the next move to make



    static    private boolean        hasRow    (char[] A,char c)
    {
        return    (A[0]==c && A[1]==c && A[2]==c)    ||
                (A[3]==c && A[4]==c && A[5]==c)    ||
                (A[6]==c && A[7]==c && A[8]==c)    ||
                (A[0]==c && A[3]==c && A[6]==c)    ||
                (A[1]==c && A[4]==c && A[7]==c)    ||
                (A[2]==c && A[5]==c && A[8]==c)    ||
                (A[0]==c && A[4]==c && A[8]==c)    ||
                (A[2]==c && A[4]==c && A[6]==c);
    }


    static    private boolean    isBoardFull    (char[] A)
    {
        return    A[0]!=' '    &&    A[1]!=' '    &&    A[2]!=' '    &&
                A[3]!=' '    &&    A[4]!=' '    &&    A[5]!=' '    &&
                A[6]!=' '    &&    A[7]!=' '    &&    A[8]!=' ';
    }


    // returns the value of the best computer move (computer plays with 'X')
    // stores the corresponding move in 'move'
    static    private    int        findCompMove(char[] A)
    {

        if    (hasRow(A,'o'))
        {
            return    HUMAN_WIN;
        }

        if    (isBoardFull(A))
        {
            return    DRAW;
        }

        int    bestmove        =    0;
        int    bestvalue    =    HUMAN_WIN;
        for (int i=0 ; i<9 && bestvalue!=COMP_WIN ; i++)
        {
            if (A[i]==' ')
            {
                A[i]='x';

                int    value    =    findHumanMove(A);
                if    (value>bestvalue)
                {
                    bestvalue    =    value;
                    bestmove        =    i;
                }

                A[i]=' ';
            }
        }

        move    =    bestmove;    //    store the move in 'move'
        return    bestvalue;
    }


    // returns the value of the best human move (computer plays with 'O')
    // stores the corresponding move in 'move'
    static    private    int        findHumanMove(char[] A)
    {

        if    (hasRow(A,'x'))
        {
            return    COMP_WIN;
        }

        if    (isBoardFull(A))
        {
            return    DRAW;
        }

        int    bestmove        =    0;
        int    bestvalue    =    COMP_WIN;
        for (int i=0 ; i<9 && bestvalue!=HUMAN_WIN ; i++)
        {
            if (A[i]==' ')
            {
                A[i]='o';

                int    value    =    findCompMove(A);
                if    (value<bestvalue)
                {
                    bestvalue    =    value;
                    bestmove        =    i;
                }

                A[i]=' ';
            }
        }

        move    =    bestmove;    //    store the move in 'move'
        return    bestvalue;
    }


    //// PUBLIC METHODS

    public    static    boolean        isLost    (char[] A)
    {
        return  hasRow(A,'x');
    }

    public    static    boolean        isWon    (char[] A)
    {
        return  hasRow(A,'o');
    }

    public    static    boolean        isDraw    (char[] A)
    {
        return  !hasRow(A,'x')    &&    !hasRow(A,'o')        &&    isBoardFull(A);
    }


    public    static    boolean        makeCompMove    (char[] A)
    {

        if(!isLost(A)    &&    !isWon(A)    &&    !isDraw(A))
        {
            findCompMove(A);
            A[move]='x';
            return  true;
        }

        return  false;
    }


}