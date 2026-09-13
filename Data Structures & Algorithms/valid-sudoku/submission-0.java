class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();

        // Key -> (row / 3) and (Cols / 3)
        HashMap<Integer, HashSet<Character>> squares = new HashMap<>();

        boolean isValid = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // If it is an empty space skip it
                if (board[i][j] == '.') {
                    continue;
                }

                char value = board[i][j];
                int box = (i / 3) * 3 + (j / 3);

                rows.computeIfAbsent(i, k -> new HashSet<>());
                cols.computeIfAbsent(j, k -> new HashSet<>());
                squares.computeIfAbsent(box, k -> new HashSet<>());

                if (rows.get(i).contains(value) || cols.get(j).contains(value)
                    || squares.get(box).contains(value)) {
                    isValid = false;
                }

                rows.get(i).add(value);
                cols.get(j).add(value);
                squares.get(box).add(value);
            }
        }

        return isValid;
    }
}
