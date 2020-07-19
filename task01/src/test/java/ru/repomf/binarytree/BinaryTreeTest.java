package ru.repomf.binarytree;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Tests for class BinaryTree.
 *
 * Created by a.makarov on 16.07.2020.
 */
public class BinaryTreeTest {

    BinaryTree tree;

    @Before
    public void prepare() {
        tree = new BinaryTree();

        tree.add(10);
        tree.add(20);
        tree.add(5);
        tree.add(3);
        tree.add(6);
        tree.add(15);
    }

    /**
     * Test.
     * Тестирование позиционирования в дереве.
     */
    @Test
    public void whenAddSomeValuesThenPositionValid() {
        assertThat(tree.getRoot().getData(), is(10));
        assertThat(tree.getRoot().getLeft().getData(), is(5));
        assertThat(tree.getRoot().getRight().getData(), is(20));
        assertThat(tree.getRoot().getLeft().getLeft().getData(), is(3));
        assertThat(tree.getRoot().getLeft().getRight().getData(), is(6));
        assertThat(tree.getRoot().getRight().getLeft().getData(), is(15));
    }

    /**
     * Test.
     * Тестирование поиска элемента в дереве.
     */
    @Test
    public void whenSearchValuesThenFound() {
        assertThat(tree.getElement(10).getData(), is(10));
        assertThat(tree.getElement(5).getData(), is(5));
        assertThat(tree.getElement(20).getData(), is(20));
        assertThat(tree.getElement(3).getData(), is(3));
        assertThat(tree.getElement(6).getData(), is(6));
        assertThat(tree.getElement(15).getData(), is(15));
    }

    /**
     * Test.
     * Тестирование поиска несуществующего элемента элемента в дереве.
     */
    @Test
    public void whenSearchMissingValuesThenNull() {
        assertThat(tree.getElement(1), nullValue());
        assertThat(tree.getElement(4), nullValue());
        assertThat(tree.getElement(7), nullValue());
    }

    /**
     * Test.
     * Тестирование поиска несуществующего элемента элемента в дереве.
     */
    @Test
    public void whenDeletingThenCorrectTree() {
        tree.remove(10);
        assertThat(tree.getRoot().getData(), is(15));
        assertThat(tree.getRoot().getRight().getData(), is(20));
        assertThat(tree.getRoot().getLeft().getData(), is(5));
        assertThat(tree.getRoot().getLeft().getLeft().getData(), is(3));
        assertThat(tree.getRoot().getLeft().getRight().getData(), is(6));
    }

    /**
     * Test.
     * Тестирование поиска несуществующего элемента элемента в дереве.
     */
    @Test
    public void whenDeletingThenCorrectTree2() {
        tree.remove(5);
        assertThat(tree.getRoot().getData(), is(10));
        assertThat(tree.getRoot().getRight().getData(), is(20));
        assertThat(tree.getRoot().getRight().getLeft().getData(), is(15));
        assertThat(tree.getRoot().getLeft().getData(), is(6));
        assertThat(tree.getRoot().getLeft().getLeft().getData(), is(3));
    }
}
