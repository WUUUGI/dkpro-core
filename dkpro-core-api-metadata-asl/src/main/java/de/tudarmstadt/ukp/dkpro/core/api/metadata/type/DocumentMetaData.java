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
 */
/* First created by JCasGen Mon Nov 08 23:55:50 CET 2010 */
package de.tudarmstadt.ukp.dkpro.core.api.metadata.type;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.fit.util.CasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.DocumentAnnotation;

/**
 * @generated
 */
public class DocumentMetaData
    extends DocumentAnnotation
{
    /**
     * @generated
     * @ordered
     */
    public final static int typeIndexID = JCasRegistry.register(DocumentMetaData.class);
    /**
     * @generated
     * @ordered
     */
    public final static int type = typeIndexID;

    /** @generated */
    @Override
    public int getTypeIndexID()
    {
        return typeIndexID;
    }

    /**
     * Never called. Disable default constructor
     *
     * @generated
     */
    protected DocumentMetaData()
    {
    }

    /**
     * Internal - constructor used by generator
     * 
     * @generated
     * @param addr
     *            low level Feature Structure reference
     * @param type
     *            the type of this Feature Structure
     */
    public DocumentMetaData(int addr, TOP_Type type)
    {
        super(addr, type);
        readObject();
    }

    /**
     * @generated
     * @param jcas
     *            JCas to which this Feature Structure belongs
     */
    public DocumentMetaData(JCas jcas)
    {
        super(jcas);
        readObject();
    }

    /**
     * @generated
     * @param jcas
     *            JCas to which this Feature Structure belongs
     * @param begin
     *            offset to the begin spot in the SofA
     * @param end
     *            offset to the end spot in the SofA
     */
    public DocumentMetaData(JCas jcas, int begin, int end)
    {
        super(jcas);
        setBegin(begin);
        setEnd(end);
        readObject();
    }

    /**
     * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
     * 
     * @generated modifiable
     */
    private void readObject()
    {
    }

    // *--------------*
    // * Feature: documentTitle

    /**
     * getter for documentTitle - gets The human readable title of the document.
     * 
     * @generated
     * @return value of the feature
     */
    public String getDocumentTitle()
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentTitle == null) {
            jcasType.jcas.throwFeatMissing("documentTitle",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        return jcasType.ll_cas.ll_getStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentTitle);
    }

    /**
     * setter for documentTitle - sets The human readable title of the document.
     * 
     * @generated
     * @param v
     *            value to set into the feature
     */
    public void setDocumentTitle(String v)
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentTitle == null) {
            jcasType.jcas.throwFeatMissing("documentTitle",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        jcasType.ll_cas.ll_setStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentTitle, v);
    }

    // *--------------*
    // * Feature: documentId

    /**
     * getter for documentId - gets The id of the document.
     * 
     * @generated
     * @return value of the feature
     */
    public String getDocumentId()
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentId == null) {
            jcasType.jcas.throwFeatMissing("documentId",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        return jcasType.ll_cas.ll_getStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentId);
    }

    /**
     * setter for documentId - sets The id of the document.
     * 
     * @generated
     * @param v
     *            value to set into the feature
     */
    public void setDocumentId(String v)
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentId == null) {
            jcasType.jcas.throwFeatMissing("documentId",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        jcasType.ll_cas.ll_setStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentId, v);
    }

    // *--------------*
    // * Feature: documentUri

    /**
     * getter for documentUri - gets The URI of the document.
     * 
     * @generated
     * @return value of the feature
     */
    public String getDocumentUri()
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentUri == null) {
            jcasType.jcas.throwFeatMissing("documentUri",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        return jcasType.ll_cas.ll_getStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentUri);
    }

    /**
     * setter for documentUri - sets The URI of the document.
     * 
     * @generated
     * @param v
     *            value to set into the feature
     */
    public void setDocumentUri(String v)
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentUri == null) {
            jcasType.jcas.throwFeatMissing("documentUri",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        jcasType.ll_cas.ll_setStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentUri, v);
    }

    // *--------------*
    // * Feature: collectionId

    /**
     * getter for collectionId - gets The ID of the whole document collection.
     * 
     * @generated
     * @return value of the feature
     */
    public String getCollectionId()
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_collectionId == null) {
            jcasType.jcas.throwFeatMissing("collectionId",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        return jcasType.ll_cas.ll_getStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_collectionId);
    }

    /**
     * setter for collectionId - sets The ID of the whole document collection.
     * 
     * @generated
     * @param v
     *            value to set into the feature
     */
    public void setCollectionId(String v)
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_collectionId == null) {
            jcasType.jcas.throwFeatMissing("collectionId",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        jcasType.ll_cas.ll_setStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_collectionId, v);
    }

    // *--------------*
    // * Feature: documentBaseUri

    /**
     * getter for documentBaseUri - gets Base URI of the document.
     * 
     * @generated
     * @return value of the feature
     */
    public String getDocumentBaseUri()
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentBaseUri == null) {
            jcasType.jcas.throwFeatMissing("documentBaseUri",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        return jcasType.ll_cas.ll_getStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentBaseUri);
    }

    /**
     * setter for documentBaseUri - sets Base URI of the document.
     * 
     * @generated
     * @param v
     *            value to set into the feature
     */
    public void setDocumentBaseUri(String v)
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_documentBaseUri == null) {
            jcasType.jcas.throwFeatMissing("documentBaseUri",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        jcasType.ll_cas.ll_setStringValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_documentBaseUri, v);
    }

    // *--------------*
    // * Feature: isLastSegment

    /**
     * getter for isLastSegment - gets CAS de-multipliers need to know whether a CAS is the last
     * multiplied segment. Thus CAS multipliers should set this field to true for the last CAS they
     * produce.
     * 
     * @generated
     * @return value of the feature
     */
    public boolean getIsLastSegment()
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_isLastSegment == null) {
            jcasType.jcas.throwFeatMissing("isLastSegment",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        return jcasType.ll_cas.ll_getBooleanValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_isLastSegment);
    }

    /**
     * setter for isLastSegment - sets CAS de-multipliers need to know whether a CAS is the last
     * multiplied segment. Thus CAS multipliers should set this field to true for the last CAS they
     * produce.
     * 
     * @generated
     * @param v
     *            value to set into the feature
     */
    public void setIsLastSegment(boolean v)
    {
        if (DocumentMetaData_Type.featOkTst
                && ((DocumentMetaData_Type) jcasType).casFeat_isLastSegment == null) {
            jcasType.jcas.throwFeatMissing("isLastSegment",
                    "de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData");
        }
        jcasType.ll_cas.ll_setBooleanValue(addr,
                ((DocumentMetaData_Type) jcasType).casFeatCode_isLastSegment, v);
    }

    /**
     * Create a new {@link DocumentMetaData} annotation in the given CAS. The meta data fields can
     * then be set on the returned object.
     *
     * @param aCas
     *            the CAS to create the meta data for.
     * @return a {@link DocumentMetaData} annotation that has already been added to the CAS indexes.
     * @throws IllegalStateException
     *             if there is already a {@link DocumentMetaData} annotation
     * @throws CASException
     *             if the JCas cannot be accessed from the provided CAS.
     */
    public static DocumentMetaData create(final CAS aCas) throws IllegalStateException, CASException
    {
        try {
            get(aCas);
            throw new IllegalStateException("CAS already contains DocumentMetaData");
        }
        catch (IllegalArgumentException e) {
            DocumentMetaData docMetaData = new DocumentMetaData(aCas.getJCas());
            initDocumentMetaData(docMetaData);
            return docMetaData;
        }
    }

    /**
     * Create a new {@link DocumentMetaData} annotation in the given CAS. The meta data fields can
     * then be set on the returned object.
     *
     * @param aJcas
     *            the CAS to create the meta data for.
     * @return a {@link DocumentMetaData} annotation that has already been added to the CAS indexes.
     * @throws IllegalStateException
     *             if there is already a {@link DocumentMetaData} annotation
     */
    public static DocumentMetaData create(final JCas aJcas) throws IllegalStateException
    {
        try {
            get(aJcas);
            throw new IllegalStateException("CAS already contains DocumentMetaData");
        }
        catch (IllegalArgumentException e) {
            DocumentMetaData docMetaData = new DocumentMetaData(aJcas);
            initDocumentMetaData(docMetaData);
            return docMetaData;
        }
    }

    private static DocumentMetaData initDocumentMetaData(DocumentMetaData aMetaData)
    {
        // If there is already a DocumentAnnotation copy it's information and delete it
        DocumentAnnotation da = getDocumentAnnotation(aMetaData.getView());
        if (da != null) {
            aMetaData.setLanguage(da.getLanguage());
            aMetaData.setBegin(da.getBegin());
            aMetaData.setEnd(da.getEnd());
            da.removeFromIndexes();
        }
        else if (aMetaData.getView().getDocumentText() != null) {
            aMetaData.setBegin(0);
            aMetaData.setEnd(aMetaData.getView().getDocumentText().length());
        }

        aMetaData.addToIndexes();
        return aMetaData;
    }

    /**
     * Copy the {@link DocumentMetaData} annotation from one view to another.
     *
     * @param aSourceView
     *            the source.
     * @param aTargetView
     *            the target.
     */
    public static void copy(final JCas aSourceView, final JCas aTargetView)
    {
        // First get the DMD then create. In case the get fails, we do not create.
        DocumentMetaData dmd = get(aSourceView);
        DocumentMetaData docMetaData = create(aTargetView);
        docMetaData.setCollectionId(dmd.getCollectionId());
        docMetaData.setDocumentBaseUri(dmd.getDocumentBaseUri());
        docMetaData.setDocumentId(dmd.getDocumentId());
        docMetaData.setDocumentTitle(dmd.getDocumentTitle());
        docMetaData.setDocumentUri(dmd.getDocumentUri());
        docMetaData.setIsLastSegment(dmd.getIsLastSegment());
        docMetaData.setLanguage(dmd.getLanguage());
    }

    /**
     * Get the {@link DocumentMetaData} from the CAS.
     * 
     * @param aCas
     *            a CAS.
     * @return the {@link DocumentMetaData} from the CAS.
     * @throws IllegalArgumentException
     *             if no {@link DocumentMetaData} exists in the CAS.
     */
    public static DocumentMetaData get(final CAS aCas)
    {
        FSIterator<FeatureStructure> iterator = aCas.getIndexRepository()
                .getAllIndexedFS(CasUtil.getType(aCas, DocumentMetaData.class));

        if (!iterator.hasNext()) {
            throw new IllegalArgumentException(
                    new Throwable("CAS does not contain any " + DocumentMetaData.class.getName()));
        }

        DocumentMetaData result = (DocumentMetaData) iterator.next();

        if (iterator.hasNext()) {
            throw new IllegalArgumentException(new Throwable(
                    "CAS contains more than one " + DocumentMetaData.class.getName()));
        }

        return result;
    }

    /**
     * Get the {@link DocumentAnnotation} from the CAS if it already exists.
     * 
     * @param aCas
     *            a CAS.
     * @return the {@link DocumentAnnotation} from the CAS.
     */
    private static DocumentAnnotation getDocumentAnnotation(final CAS aCas)
    {
        FSIterator<FeatureStructure> iterator = aCas.getIndexRepository()
                .getAllIndexedFS(CasUtil.getType(aCas, DocumentAnnotation.class));

        if (!iterator.hasNext()) {
            return null;
        }

        DocumentAnnotation result = (DocumentAnnotation) iterator.next();

        if (iterator.hasNext()) {
            throw new IllegalArgumentException(new Throwable(
                    "CAS contains more than one " + DocumentAnnotation.class.getName()));
        }

        return result;
    }

    /**
     * Get the {@link DocumentMetaData} from the CAS.
     *
     * @param aJCas
     *            the JCas.
     * @return the {@link DocumentMetaData} from the CAS.
     * @throws IllegalArgumentException
     *             if no {@link DocumentMetaData} exists in the CAS.
     */
    public static DocumentMetaData get(final JCas aJCas)
    {
        return get(aJCas.getCas());
    }
}
