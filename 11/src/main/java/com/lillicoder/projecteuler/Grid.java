/*
 * Copyright 2016 Scott Weeden-Moody
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this project except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lillicoder.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a two dimensional grid.
 * @param <T> Type of value at each node.
 */
class Grid<T> {

    /**
     * Represents navigable directions on a grid.
     */
    enum Direction {

        UP,
        DOWN,
        LEFT,
        RIGHT,
        UP_LEFT,
        UP_RIGHT,
        DOWN_LEFT,
        DOWN_RIGHT

    }

    private final T[][] grid;

    Grid(T[][] grid) {
        if (grid == null) {
            throw new IllegalArgumentException("Cannot instantiate a grid with a null array.");
        }

        this.grid = grid;
    }

    /**
     * Gets the number of columns for this grid.
     * @return Column count.
     */
    int columnCount() {
        return grid.length == 0 ? 0 : grid[0].length;
    }

    /**
     * Gets the number of rows for this grid.
     * @return Row count.
     */
    int rowCount() {
        return grid.length;
    }

    /**
     * Gets a list of nodes in the given {@link Direction} for the given length.
     * If there are fewer nodes than the given length for a direction, only
     * those nodes will be returned.
     * @param direction Direction to get nodes.
     * @param length Number of nodes to get.
     * @return Nodes in the given direction.
     */
    List<T> get(int row, int column, Direction direction, int length) {
        switch (direction) {
            case UP:
                return up(row, column, length);
            case DOWN:
                return down(row, column, length);
            case LEFT:
                return left(row, column, length);
            case RIGHT:
                return right(row, column, length);
            case UP_LEFT:
                return upLeft(row, column, length);
            case UP_RIGHT:
                return upRight(row, column, length);
            case DOWN_LEFT:
                return downLeft(row, column, length);
            case DOWN_RIGHT:
                return downRight(row, column, length);
            default:
                throw new IllegalArgumentException("Unknown direction type, cannot get nodes. " +
                                                           "[direction = " + direction + "]");
        }
    }

    /**
     * Gets the nodes upward from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Up direction nodes.
     */
    private List<T> up(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();

        for (int position = 0; position < length; position++) {
            int currentRow = row - position;
            if (currentRow < 0) {
                break;
            }

            T node = grid[currentRow][column];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes downward from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Down direction nodes.
     */
    private List<T> down(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();
        int rowCount = rowCount();

        for (int position = 0; position < length; position++) {
            int currentRow = row + position;
            if (currentRow > rowCount) {
                break;
            }

            T node = grid[currentRow][column];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes leftward from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Left direction nodes.
     */
    private List<T> left(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();

        for (int position = 0; position < length; position++) {
            int currentColumn = column - position;
            if (currentColumn < 0) {
                break;
            }

            T node = grid[row][currentColumn];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes rightward from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Right direction nodes.
     */
    private List<T> right(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();
        int columnCount = columnCount();

        for (int position = 0; position < length; position++) {
            int currentColumn = column + position;
            if (currentColumn > columnCount) {
                break;
            }

            T node = grid[row][currentColumn];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes diagonally up-left from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Up-left direction nodes.
     */
    private List<T> upLeft(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();

        for (int position = 0; position < length; position++) {
            int currentRow = row - position;
            int currentColumn = column - position;

            if (currentRow < 0 || currentColumn < 0) {
                break;
            }

            T node = grid[currentRow][currentColumn];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes diagonally up-right from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Up-right direction nodes.
     */
    private List<T> upRight(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();
        int columnCount = columnCount();

        for (int position = 0; position < length; position++) {
            int currentRow = row - position;
            int currentColumn = column + position;

            if (currentRow < 0 || currentColumn > columnCount) {
                break;
            }

            T node = grid[currentRow][currentColumn];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes diagonally down-left from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Down-left direction nodes.
     */
    private List<T> downLeft(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();
        int rowCount = rowCount();

        for (int position = 0; position < length; position++) {
            int currentRow = row + position;
            int currentColumn = column - position;

            if (currentRow > rowCount || currentColumn < 0) {
                break;
            }

            T node = grid[currentRow][currentColumn];
            nodes.add(node);
        }

        return nodes;
    }

    /**
     * Gets the nodes diagonally down-right from the node at the given row and column.
     * @param row Starting node row.
     * @param column Starting node column.
     * @param length Number of nodes to get.
     * @return Down-right direction nodes.
     */
    private List<T> downRight(int row, int column, int length) {
        List<T> nodes = new ArrayList<>();
        int rowCount = rowCount();
        int columnCount = columnCount();

        for (int position = 0; position < length; position++) {
            int currentRow = row + position;
            int currentColumn = column + position;

            if (currentRow > rowCount || currentColumn > columnCount) {
                break;
            }

            T node = grid[currentRow][currentColumn];
            nodes.add(node);
        }

        return nodes;
    }

}
