package com.github.lofi.client.ui.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dncomponents.client.components.tree.TreeNode;

public class Fruit {
	public static List<Fruit> fruits = Arrays.asList(new Fruit("Bell pepper", "Non-sweet"),
			new Fruit("Cucumber", "Non-sweet"), new Fruit("Tomato", "Non-sweet"),
			// Sub-acid
			new Fruit("Apple", "Sub-acid"), new Fruit("Apricot", "Sub-acid"), new Fruit("Blackberry", "Sub-acid"),
			new Fruit("Cherry", "Sub-acid"),
			// Sweet
			new Fruit("Banana", "Sweet"), new Fruit("Papaya", "Sweet"), new Fruit("Prune", "Sweet"),
			// Acid
			new Fruit("Kiwi", "Acid"), new Fruit("Lemon", "Acid"), new Fruit("Orange", "Acid"));

	private String name;
	private String description;

	public Fruit() {
	}

	public Fruit(String name, String description) {
		this.description = description;
		this.name = name;
	}

	public List<Fruit> getFruits(int number) {
		List<Fruit> fruitList = new ArrayList<>();
		int n = 0;
		int nam = 0;
		for (int i = 0; i < number; i++) {
			Fruit fruit = fruits.get(nam++);
			if (nam == fruits.size() - 1)
				nam = 0;
			fruitList.add(new Fruit(fruit.getName() + "  " + n++,
					"The " + fruit.getName() + " is a " + fruit.getDescription() + " fruit"));
		}
		return fruitList;
	}

	public TreeNode<Object> getFruitsTree() {
		TreeNode<Object> root = new TreeNode<>("root");
		{
			TreeNode<Object> node = new TreeNode<>("Non-sweet");
			node.add(new TreeNode<Object>(new Fruit("Avocado", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Bell pepper", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Cucumber", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Tomato", "fruit")));
			root.add(node);
		}
		{
			TreeNode<Object> node = new TreeNode<>("Sub-acid");
			node.add(new TreeNode<Object>(new Fruit("Apple", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Apricot", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Blackberry", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Cherry", "fruit")));
			root.add(node);
		}
		{
			TreeNode<Object> node = new TreeNode<>("Sweet");
			node.add(new TreeNode<Object>(new Fruit("Banana", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Papaya", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Prune", "fruit")));
			root.add(node);
		}
		{
			TreeNode<Object> node = new TreeNode<>("Acid");
			node.add(new TreeNode<Object>(new Fruit("Kiwi", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Lemon", "fruit")));
			node.add(new TreeNode<Object>(new Fruit("Orange", "fruit")));
			root.add(node);
		}
		return root;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
}
