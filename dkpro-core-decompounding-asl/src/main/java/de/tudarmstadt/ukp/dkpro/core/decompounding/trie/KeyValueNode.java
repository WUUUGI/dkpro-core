/*
 * Copyright 2017
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package de.tudarmstadt.ukp.dkpro.core.decompounding.trie;

import java.util.ArrayList;
import java.util.List;

/**
 * A key/value tree node
 * 
 * 
 * @param <K>
 *            The Key object
 * @param <V>
 *            The value object
 */
public class KeyValueNode<K, V>
{

    K key;
    V value;
    List<KeyValueNode<K, V>> children = new ArrayList<KeyValueNode<K, V>>();

    /**
     * Creates a tree node for a given key and value
     * 
     * @param aKey
     *            The key of this node
     * @param aValue
     *            The value of the node
     */
    public KeyValueNode(K aKey, V aValue)
    {
        key = aKey;
        value = aValue;
    }

    /**
     * Returns the key object
     * 
     * @return the key.
     */
    public K getKey()
    {
        return key;
    }

    /**
     * Set a new key to this object
     * 
     * @param aKey
     *            the key.
     */
    public void setKey(K aKey)
    {
        key = aKey;
    }

    /**
     * Returns the value object
     * 
     * @return the value.
     */
    public V getValue()
    {
        return value;
    }

    /**
     * Sets a new value for this object
     * 
     * @param aValue
     *            the value.
     */
    public void setValue(V aValue)
    {
        value = aValue;
    }

    /**
     * Checks if this node has children
     * 
     * @return if this node has children.
     */
    public boolean hasChildren()
    {
        return children.size() > 0;
    }

    /**
     * Gets a child object for a given key. If a node with the given key do not exist NULL is
     * returned.
     * 
     * @param aKey
     *            a key.
     * @return the child object.
     */
    public KeyValueNode<K, V> getChild(K aKey)
    {
        for (KeyValueNode<K, V> node : children) {
            if (node.key.equals(aKey)) {
                return node;
            }
        }

        return null;
    }

    /**
     * Checks if this node has a child with a given key
     * 
     * @param aKey
     *            a key.
     * @return if a child with this key exists.
     */
    public boolean hasChild(K aKey)
    {
        return (getChild(aKey) != null);
    }

    /**
     * Adds a child object to this node
     * 
     * @param aNode
     *            a node.
     */
    public void addChild(KeyValueNode<K, V> aNode)
    {
        children.add(aNode);
    }

    /**
     * Adds child object to this node
     * 
     * @param aKey
     *            a key.
     * @param aValue
     *            a value.
     */
    public void addChild(K aKey, V aValue)
    {
        addChild(new KeyValueNode<K, V>(aKey, aValue));
    }

    /**
     * Returns all children of the node
     * 
     * @return all children of the node
     */
    public List<KeyValueNode<K, V>> getChildren()
    {
        return children;
    }

    /**
     * Set a list of children to this node
     * 
     * @param aChildren
     *            the list of children.
     */
    public void setChildren(List<KeyValueNode<K, V>> aChildren)
    {
        children = aChildren;
    }

    /**
     * Checks if the node is a leaf node
     * 
     * @return if the node is a leaf node
     */
    public boolean isLeaf()
    {
        return !hasChildren();
    }
}
