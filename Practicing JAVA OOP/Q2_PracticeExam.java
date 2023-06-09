class Matrix<T> {

    T[][] array;
    int row, col;
    Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        array = (T[][]) new Object[row][col];
    }

    public T[][] get(int row, int col) {
        T element = array[row][col];
        return array;
    }

    public T[][] set(int row, int col, T value) {
        array[row][col] = value;
        return array;
    }

    public T[][] transpose(int row, int col, T[][] array) {
        T[][] newArray = (T[][]) new Object[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        return newArray;
    }

    public Matrix<T> add(Matrix<T> other) throws IllegalArgumentException {
        if (row != other.row || col != other.col) {
            throw new ArrayIndexOutOfBoundsException("Matrix dimensions are not equal.");
        }

        Matrix<T> resultArray = new Matrix<>(row,col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                T value = array[i][j];
                T secondValue = (T) other.get(i,j);

                if (value instanceof Integer && secondValue instanceof Integer) {
                    Integer sum = (Integer) value + (Integer) secondValue;
                    resultArray.set(i,j, (T) sum);
                }
                else if (value instanceof Double && secondValue instanceof Double) {
                    Double sum = (Double) value + (Double) secondValue;
                    resultArray.set(i, j, (T) value);
                }
                else {
                    throw new IllegalArgumentException("Matrix elements must be of numberic types.");
                }

            }
        }
        return resultArray;
    }
}
public class Q2_PracticeExam {
}
