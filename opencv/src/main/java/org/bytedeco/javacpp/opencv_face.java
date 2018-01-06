// Targeted by JavaCPP version 1.3.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_dnn.*;
import static org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_photo.*;
import static org.bytedeco.javacpp.opencv_video.*;

public class opencv_face extends org.bytedeco.javacpp.presets.opencv_face {
    static { Loader.load(); }

// Parsed from <opencv2/face/predict_collector.hpp>

/*
By downloading, copying, installing or using the software you agree to this license.
If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2000-2015, Intel Corporation, all rights reserved.
Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
Copyright (C) 2009-2015, NVIDIA Corporation, all rights reserved.
Copyright (C) 2010-2013, Advanced Micro Devices, Inc., all rights reserved.
Copyright (C) 2015, OpenCV Foundation, all rights reserved.
Copyright (C) 2015, Itseez Inc., all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are disclaimed.
In no event shall copyright holders or contributors be liable for any direct,
indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_PREDICT_COLLECTOR_HPP__
// #define __OPENCV_PREDICT_COLLECTOR_HPP__

// #include <vector>
// #include <map>
// #include <utility>
// #include <cfloat>

// #include "opencv2/core/cvstd.hpp"
/** \addtogroup face
 *  \{
/** \brief Abstract base class for all strategies of prediction result handling
*/
@Namespace("cv::face") public static class PredictCollector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PredictCollector(Pointer p) { super(p); }


    /** \brief Interface method called by face recognizer before results processing
    @param size total size of prediction evaluation that recognizer could perform
    */
    public native void init(@Cast("size_t") long size);

    /** \brief Interface method called by face recognizer for each result
    @param label current prediction label
    @param dist current prediction distance (confidence)
    */
    public native @Cast("bool") boolean collect(int label, double dist);
}

/** \brief Default predict collector
<p>
Trace minimal distance with treshhold checking (that is default behavior for most predict logic)
*/
@Namespace("cv::face") @NoOffset public static class StandardCollector extends PredictCollector {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StandardCollector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StandardCollector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StandardCollector position(long position) {
        return (StandardCollector)super.position(position);
    }

    @NoOffset public static class PredictResult extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PredictResult(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PredictResult(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PredictResult position(long position) {
            return (PredictResult)super.position(position);
        }
    
        public native int label(); public native PredictResult label(int label);
        public native double distance(); public native PredictResult distance(double distance);
        public PredictResult(int label_/*=-1*/, double distance_/*=DBL_MAX*/) { super((Pointer)null); allocate(label_, distance_); }
        private native void allocate(int label_/*=-1*/, double distance_/*=DBL_MAX*/);
        public PredictResult() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
    /** \brief Constructor
    @param threshold_ set threshold
    */
    public StandardCollector(double threshold_/*=DBL_MAX*/) { super((Pointer)null); allocate(threshold_); }
    private native void allocate(double threshold_/*=DBL_MAX*/);
    public StandardCollector() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \brief overloaded interface method */
    public native void init(@Cast("size_t") long size);
    /** \brief overloaded interface method */
    public native @Cast("bool") boolean collect(int label, double dist);
    /** \brief Returns label with minimal distance */
    public native int getMinLabel();
    /** \brief Returns minimal distance value */
    public native double getMinDist();
    /** \brief Return results as vector
    @param sorted If set, results will be sorted by distance
    Each values is a pair of label and distance.
    */
    public native @ByVal IntDoublePairVector getResults(@Cast("bool") boolean sorted/*=false*/);
    public native @ByVal IntDoublePairVector getResults();
    /** \brief Return results as map
    Labels are keys, values are minimal distances
    */
    public native @ByVal IntDoubleMap getResultsMap();
    /** \brief Static constructor
    @param threshold set threshold
    */
    public static native @Ptr StandardCollector create(double threshold/*=DBL_MAX*/);
    public static native @Ptr StandardCollector create();
}

/** \} */



// #endif


// Parsed from <opencv2/face.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.

                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_FACE_HPP__
// #define __OPENCV_FACE_HPP__

/**
\defgroup face Face Analysis
<p>
- \ref face_changelog
- \ref tutorial_face_main
<p>
*/

// #include "opencv2/core.hpp"
// #include "face/predict_collector.hpp"
// #include <map>

/** \addtogroup face
 *  \{
<p>
/** \brief Abstract base class for all face recognition models
<p>
All face recognition models in OpenCV are derived from the abstract base class FaceRecognizer, which
provides a unified access to all face recongition algorithms in OpenCV.
<p>
### Description
<p>
I'll go a bit more into detail explaining FaceRecognizer, because it doesn't look like a powerful
interface at first sight. But: Every FaceRecognizer is an Algorithm, so you can easily get/set all
model internals (if allowed by the implementation). Algorithm is a relatively new OpenCV concept,
which is available since the 2.4 release. I suggest you take a look at its description.
<p>
Algorithm provides the following features for all derived classes:
<p>
-   So called "virtual constructor". That is, each Algorithm derivative is registered at program
    start and you can get the list of registered algorithms and create instance of a particular
    algorithm by its name (see Algorithm::create). If you plan to add your own algorithms, it is
    good practice to add a unique prefix to your algorithms to distinguish them from other
    algorithms.
-   Setting/Retrieving algorithm parameters by name. If you used video capturing functionality from
    OpenCV highgui module, you are probably familar with cv::cvSetCaptureProperty,
ocvcvGetCaptureProperty, VideoCapture::set and VideoCapture::get. Algorithm provides similar
    method where instead of integer id's you specify the parameter names as text Strings. See
    Algorithm::set and Algorithm::get for details.
-   Reading and writing parameters from/to XML or YAML files. Every Algorithm derivative can store
    all its parameters and then read them back. There is no need to re-implement it each time.
<p>
Moreover every FaceRecognizer supports the:
<p>
-   **Training** of a FaceRecognizer with FaceRecognizer::train on a given set of images (your face
    database!).
-   **Prediction** of a given sample image, that means a face. The image is given as a Mat.
-   **Loading/Saving** the model state from/to a given XML or YAML.
-   **Setting/Getting labels info**, that is stored as a string. String labels info is useful for
    keeping names of the recognized people.
<p>
\note When using the FaceRecognizer interface in combination with Python, please stick to Python 2.
Some underlying scripts like create_csv will not work in other versions, like Python 3. Setting the
Thresholds +++++++++++++++++++++++
<p>
Sometimes you run into the situation, when you want to apply a threshold on the prediction. A common
scenario in face recognition is to tell, whether a face belongs to the training dataset or if it is
unknown. You might wonder, why there's no public API in FaceRecognizer to set the threshold for the
prediction, but rest assured: It's supported. It just means there's no generic way in an abstract
class to provide an interface for setting/getting the thresholds of *every possible* FaceRecognizer
algorithm. The appropriate place to set the thresholds is in the constructor of the specific
FaceRecognizer and since every FaceRecognizer is a Algorithm (see above), you can get/set the
thresholds at runtime!
<p>
Here is an example of setting a threshold for the Eigenfaces method, when creating the model:
<p>
<pre>{@code
// Let's say we want to keep 10 Eigenfaces and have a threshold value of 10.0
int num_components = 10;
double threshold = 10.0;
// Then if you want to have a cv::FaceRecognizer with a confidence threshold,
// create the concrete implementation with the appropiate parameters:
Ptr<FaceRecognizer> model = EigenFaceRecognizer::create(num_components, threshold);
}</pre>
<p>
Sometimes it's impossible to train the model, just to experiment with threshold values. Thanks to
Algorithm it's possible to set internal model thresholds during runtime. Let's see how we would
set/get the prediction for the Eigenface model, we've created above:
<p>
<pre>{@code
// The following line reads the threshold from the Eigenfaces model:
double current_threshold = model->getDouble("threshold");
// And this line sets the threshold to 0.0:
model->set("threshold", 0.0);
}</pre>
<p>
If you've set the threshold to 0.0 as we did above, then:
<p>
<pre>{@code
//
Mat img = imread("person1/3.jpg", CV_LOAD_IMAGE_GRAYSCALE);
// Get a prediction from the model. Note: We've set a threshold of 0.0 above,
// since the distance is almost always larger than 0.0, you'll get -1 as
// label, which indicates, this face is unknown
int predicted_label = model->predict(img);
// ...
}</pre>
<p>
is going to yield -1 as predicted label, which states this face is unknown.
<p>
### Getting the name of a FaceRecognizer
<p>
Since every FaceRecognizer is a Algorithm, you can use Algorithm::name to get the name of a
FaceRecognizer:
<p>
<pre>{@code
// Create a FaceRecognizer:
Ptr<FaceRecognizer> model = EigenFaceRecognizer::create();
// And here's how to get its name:
String name = model->name();
}</pre>
 <p>
 */
@Namespace("cv::face") @NoOffset public static class FaceRecognizer extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FaceRecognizer(Pointer p) { super(p); }

    /** \brief Trains a FaceRecognizer with given data and associated labels.
    <p>
    @param src The training images, that means the faces you want to learn. The data has to be
    given as a vector\<Mat\>.
    @param labels The labels corresponding to the images have to be given either as a vector\<int\>
    or a
    <p>
    The following source code snippet shows you how to learn a Fisherfaces model on a given set of
    images. The images are read with imread and pushed into a std::vector\<Mat\>. The labels of each
    image are stored within a std::vector\<int\> (you could also use a Mat of type CV_32SC1). Think of
    the label as the subject (the person) this image belongs to, so same subjects (persons) should have
    the same label. For the available FaceRecognizer you don't have to pay any attention to the order of
    the labels, just make sure same persons have the same label:
    <p>
    <pre>{@code
    // holds images and labels
    vector<Mat> images;
    vector<int> labels;
    // images for first person
    images.push_back(imread("person0/0.jpg", CV_LOAD_IMAGE_GRAYSCALE)); labels.push_back(0);
    images.push_back(imread("person0/1.jpg", CV_LOAD_IMAGE_GRAYSCALE)); labels.push_back(0);
    images.push_back(imread("person0/2.jpg", CV_LOAD_IMAGE_GRAYSCALE)); labels.push_back(0);
    // images for second person
    images.push_back(imread("person1/0.jpg", CV_LOAD_IMAGE_GRAYSCALE)); labels.push_back(1);
    images.push_back(imread("person1/1.jpg", CV_LOAD_IMAGE_GRAYSCALE)); labels.push_back(1);
    images.push_back(imread("person1/2.jpg", CV_LOAD_IMAGE_GRAYSCALE)); labels.push_back(1);
    }</pre>
    <p>
    Now that you have read some images, we can create a new FaceRecognizer. In this example I'll create
    a Fisherfaces model and decide to keep all of the possible Fisherfaces:
    <p>
    <pre>{@code
    // Create a new Fisherfaces model and retain all available Fisherfaces,
    // this is the most common usage of this specific FaceRecognizer:
    //
    Ptr<FaceRecognizer> model =  FisherFaceRecognizer::create();
    }</pre>
    <p>
    And finally train it on the given dataset (the face images and labels):
    <p>
    <pre>{@code
    // This is the common interface to train all of the available cv::FaceRecognizer
    // implementations:
    //
    model->train(images, labels);
    }</pre>
     */
    public native void train(@ByVal MatVector src, @ByVal Mat labels);
    public native void train(@ByVal UMatVector src, @ByVal Mat labels);
    public native void train(@ByVal GpuMatVector src, @ByVal Mat labels);
    public native void train(@ByVal MatVector src, @ByVal UMat labels);
    public native void train(@ByVal UMatVector src, @ByVal UMat labels);
    public native void train(@ByVal GpuMatVector src, @ByVal UMat labels);
    public native void train(@ByVal MatVector src, @ByVal GpuMat labels);
    public native void train(@ByVal UMatVector src, @ByVal GpuMat labels);
    public native void train(@ByVal GpuMatVector src, @ByVal GpuMat labels);

    /** \brief Updates a FaceRecognizer with given data and associated labels.
    <p>
    @param src The training images, that means the faces you want to learn. The data has to be given
    as a vector\<Mat\>.
    @param labels The labels corresponding to the images have to be given either as a vector\<int\> or
    a
    <p>
    This method updates a (probably trained) FaceRecognizer, but only if the algorithm supports it. The
    Local Binary Patterns Histograms (LBPH) recognizer (see createLBPHFaceRecognizer) can be updated.
    For the Eigenfaces and Fisherfaces method, this is algorithmically not possible and you have to
    re-estimate the model with FaceRecognizer::train. In any case, a call to train empties the existing
    model and learns a new model, while update does not delete any model data.
    <p>
    <pre>{@code
    // Create a new LBPH model (it can be updated) and use the default parameters,
    // this is the most common usage of this specific FaceRecognizer:
    //
    Ptr<FaceRecognizer> model =  LBPHFaceRecognizer::create();
    // This is the common interface to train all of the available cv::FaceRecognizer
    // implementations:
    //
    model->train(images, labels);
    // Some containers to hold new image:
    vector<Mat> newImages;
    vector<int> newLabels;
    // You should add some images to the containers:
    //
    // ...
    //
    // Now updating the model is as easy as calling:
    model->update(newImages,newLabels);
    // This will preserve the old model data and extend the existing model
    // with the new features extracted from newImages!
    }</pre>
    <p>
    Calling update on an Eigenfaces model (see EigenFaceRecognizer::create), which doesn't support
    updating, will throw an error similar to:
    <p>
    <pre>{@code
    OpenCV Error: The function/feature is not implemented (This FaceRecognizer (FaceRecognizer.Eigenfaces) does not support updating, you have to use FaceRecognizer::train to update it.) in update, file /home/philipp/git/opencv/modules/contrib/src/facerec.cpp, line 305
    terminate called after throwing an instance of 'cv::Exception'
    }</pre>
    <p>
    \note The FaceRecognizer does not store your training images, because this would be very
    memory intense and it's not the responsibility of te FaceRecognizer to do so. The caller is
    responsible for maintaining the dataset, he want to work with.
     */
    public native void update(@ByVal MatVector src, @ByVal Mat labels);
    public native void update(@ByVal UMatVector src, @ByVal Mat labels);
    public native void update(@ByVal GpuMatVector src, @ByVal Mat labels);
    public native void update(@ByVal MatVector src, @ByVal UMat labels);
    public native void update(@ByVal UMatVector src, @ByVal UMat labels);
    public native void update(@ByVal GpuMatVector src, @ByVal UMat labels);
    public native void update(@ByVal MatVector src, @ByVal GpuMat labels);
    public native void update(@ByVal UMatVector src, @ByVal GpuMat labels);
    public native void update(@ByVal GpuMatVector src, @ByVal GpuMat labels);

    /** \overload */
    public native @Name("predict") int predict_label(@ByVal Mat src);
    public native @Name("predict") int predict_label(@ByVal UMat src);
    public native @Name("predict") int predict_label(@ByVal GpuMat src);


    /** \brief Predicts a label and associated confidence (e.g. distance) for a given input image.
    <p>
    @param src Sample image to get a prediction from.
    @param label The predicted label for the given image.
    @param confidence Associated confidence (e.g. distance) for the predicted label.
    <p>
    The suffix const means that prediction does not affect the internal model state, so the method can
    be safely called from within different threads.
    <p>
    The following example shows how to get a prediction from a trained model:
    <p>
    <pre>{@code
    using namespace cv;
    // Do your initialization here (create the cv::FaceRecognizer model) ...
    // ...
    // Read in a sample image:
    Mat img = imread("person1/3.jpg", CV_LOAD_IMAGE_GRAYSCALE);
    // And get a prediction from the cv::FaceRecognizer:
    int predicted = model->predict(img);
    }</pre>
    <p>
    Or to get a prediction and the associated confidence (e.g. distance):
    <p>
    <pre>{@code
    using namespace cv;
    // Do your initialization here (create the cv::FaceRecognizer model) ...
    // ...
    Mat img = imread("person1/3.jpg", CV_LOAD_IMAGE_GRAYSCALE);
    // Some variables for the predicted label and associated confidence (e.g. distance):
    int predicted_label = -1;
    double predicted_confidence = 0.0;
    // Get the prediction and associated confidence from the model
    model->predict(img, predicted_label, predicted_confidence);
    }</pre>
     */
    public native void predict(@ByVal Mat src, @ByRef IntPointer label, @ByRef DoublePointer confidence);
    public native void predict(@ByVal Mat src, @ByRef IntBuffer label, @ByRef DoubleBuffer confidence);
    public native void predict(@ByVal Mat src, @ByRef int[] label, @ByRef double[] confidence);
    public native void predict(@ByVal UMat src, @ByRef IntPointer label, @ByRef DoublePointer confidence);
    public native void predict(@ByVal UMat src, @ByRef IntBuffer label, @ByRef DoubleBuffer confidence);
    public native void predict(@ByVal UMat src, @ByRef int[] label, @ByRef double[] confidence);
    public native void predict(@ByVal GpuMat src, @ByRef IntPointer label, @ByRef DoublePointer confidence);
    public native void predict(@ByVal GpuMat src, @ByRef IntBuffer label, @ByRef DoubleBuffer confidence);
    public native void predict(@ByVal GpuMat src, @ByRef int[] label, @ByRef double[] confidence);


    /** \brief - if implemented - send all result of prediction to collector that can be used for somehow custom result handling
    @param src Sample image to get a prediction from.
    @param collector User-defined collector object that accepts all results
    <p>
    To implement this method u just have to do same internal cycle as in predict(InputArray src, CV_OUT int &label, CV_OUT double &confidence) but
    not try to get "best\ result, just resend it to caller side with given collector
    */
    public native @Name("predict") void predict_collect(@ByVal Mat src, @Ptr PredictCollector collector);
    public native @Name("predict") void predict_collect(@ByVal UMat src, @Ptr PredictCollector collector);
    public native @Name("predict") void predict_collect(@ByVal GpuMat src, @Ptr PredictCollector collector);

    /** \brief Saves a FaceRecognizer and its model state.
    <p>
    Saves this model to a given filename, either as XML or YAML.
    @param filename The filename to store this FaceRecognizer to (either XML/YAML).
    <p>
    Every FaceRecognizer overwrites FaceRecognizer::save(FileStorage& fs) to save the internal model
    state. FaceRecognizer::save(const String& filename) saves the state of a model to the given
    filename.
    <p>
    The suffix const means that prediction does not affect the internal model state, so the method can
    be safely called from within different threads.
     */
    public native void write(@Str BytePointer filename);
    public native void write(@Str String filename);

    /** \brief Loads a FaceRecognizer and its model state.
    <p>
    Loads a persisted model and state from a given XML or YAML file . Every FaceRecognizer has to
    overwrite FaceRecognizer::load(FileStorage& fs) to enable loading the model state.
    FaceRecognizer::load(FileStorage& fs) in turn gets called by
    FaceRecognizer::load(const String& filename), to ease saving a model.
     */
    public native void read(@Str BytePointer filename);
    public native void read(@Str String filename);

    /** \overload
    Saves this model to a given FileStorage.
    @param fs The FileStorage to store this FaceRecognizer to.
    */
    public native void write(@ByRef FileStorage fs);

    /** \overload */
    public native void read(@Const @ByRef FileNode fn);

    /** \overload */
    public native @Cast("bool") boolean empty();

    /** \brief Sets string info for the specified model's label.
    <p>
    The string info is replaced by the provided value if it was set before for the specified label.
     */
    public native void setLabelInfo(int label, @Str BytePointer strInfo);
    public native void setLabelInfo(int label, @Str String strInfo);

    /** \brief Gets string information by label.
    <p>
    If an unknown label id is provided or there is no label information associated with the specified
    label id the method returns an empty string.
     */
    public native @Str BytePointer getLabelInfo(int label);

    /** \brief Gets vector of labels by string.
    <p>
    The function searches for the labels containing the specified sub-string in the associated string
    info.
     */
    public native @StdVector IntPointer getLabelsByString(@Str BytePointer str);
    public native @StdVector IntBuffer getLabelsByString(@Str String str);
    /** \brief threshold parameter accessor - required for default BestMinDist collector */
    public native double getThreshold();
    /** \brief Sets threshold of model */
    public native void setThreshold(double val);
}

/** \} */



// #include "opencv2/face/facerec.hpp"
// #include "opencv2/face/facemark.hpp"
// #include "opencv2/face/facemarkLBF.hpp"
// #include "opencv2/face/facemarkAAM.hpp"
// #include "opencv2/face/face_alignment.hpp"

// #endif // __OPENCV_FACE_HPP__


// Parsed from <opencv2/face/facerec.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// Copyright (c) 2011,2012. Philipp Wagner <bytefish[at]gmx[dot]de>.
// Third party copyrights are property of their respective owners.

// #ifndef __OPENCV_FACEREC_HPP__
// #define __OPENCV_FACEREC_HPP__

// #include "opencv2/face.hpp"
// #include "opencv2/core.hpp"

/** \addtogroup face
 *  \{ */

// base for two classes
@Namespace("cv::face") @NoOffset public static class BasicFaceRecognizer extends FaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BasicFaceRecognizer(Pointer p) { super(p); }

    /** @see setNumComponents */
    public native int getNumComponents();
    /** \copybrief getNumComponents @see getNumComponents */
    public native void setNumComponents(int val);
    /** @see setThreshold */
    public native double getThreshold();
    /** \copybrief getThreshold @see getThreshold */
    public native void setThreshold(double val);
    public native @ByVal MatVector getProjections();
    public native @ByVal Mat getLabels();
    public native @ByVal Mat getEigenValues();
    public native @ByVal Mat getEigenVectors();
    public native @ByVal Mat getMean();

    public native void read(@Const @ByRef FileNode fn);
    public native void write(@ByRef FileStorage fs);
    public native @Cast("bool") boolean empty();
}

@Namespace("cv::face") public static class EigenFaceRecognizer extends BasicFaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EigenFaceRecognizer(Pointer p) { super(p); }

    /**
    @param num_components The number of components (read: Eigenfaces) kept for this Principal
    Component Analysis. As a hint: There's no rule how many components (read: Eigenfaces) should be
    kept for good reconstruction capabilities. It is based on your input data, so experiment with the
    number. Keeping 80 components should almost always be sufficient.
    @param threshold The threshold applied in the prediction.
    <p>
    ### Notes:
    <p>
    -   Training and prediction must be done on grayscale images, use cvtColor to convert between the
        color spaces.
    -   **THE EIGENFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
        SIZE.** (caps-lock, because I got so many mails asking for this). You have to make sure your
        input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
        the images.
    -   This model does not support updating.
    <p>
    ### Model internal data:
    <p>
    -   num_components see EigenFaceRecognizer::create.
    -   threshold see EigenFaceRecognizer::create.
    -   eigenvalues The eigenvalues for this Principal Component Analysis (ordered descending).
    -   eigenvectors The eigenvectors for this Principal Component Analysis (ordered by their
        eigenvalue).
    -   mean The sample mean calculated from the training data.
    -   projections The projections of the training data.
    -   labels The threshold applied in the prediction. If the distance to the nearest neighbor is
        larger than the threshold, this method returns -1.
     */
    public static native @Ptr EigenFaceRecognizer create(int num_components/*=0*/, double threshold/*=DBL_MAX*/);
    public static native @Ptr EigenFaceRecognizer create();
}

@Namespace("cv::face") public static class FisherFaceRecognizer extends BasicFaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FisherFaceRecognizer(Pointer p) { super(p); }

    /**
    @param num_components The number of components (read: Fisherfaces) kept for this Linear
    Discriminant Analysis with the Fisherfaces criterion. It's useful to keep all components, that
    means the number of your classes c (read: subjects, persons you want to recognize). If you leave
    this at the default (0) or set it to a value less-equal 0 or greater (c-1), it will be set to the
    correct number (c-1) automatically.
    @param threshold The threshold applied in the prediction. If the distance to the nearest neighbor
    is larger than the threshold, this method returns -1.
    <p>
    ### Notes:
    <p>
    -   Training and prediction must be done on grayscale images, use cvtColor to convert between the
        color spaces.
    -   **THE FISHERFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
        SIZE.** (caps-lock, because I got so many mails asking for this). You have to make sure your
        input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
        the images.
    -   This model does not support updating.
    <p>
    ### Model internal data:
    <p>
    -   num_components see FisherFaceRecognizer::create.
    -   threshold see FisherFaceRecognizer::create.
    -   eigenvalues The eigenvalues for this Linear Discriminant Analysis (ordered descending).
    -   eigenvectors The eigenvectors for this Linear Discriminant Analysis (ordered by their
        eigenvalue).
    -   mean The sample mean calculated from the training data.
    -   projections The projections of the training data.
    -   labels The labels corresponding to the projections.
     */
    public static native @Ptr FisherFaceRecognizer create(int num_components/*=0*/, double threshold/*=DBL_MAX*/);
    public static native @Ptr FisherFaceRecognizer create();
}


@Namespace("cv::face") public static class LBPHFaceRecognizer extends FaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LBPHFaceRecognizer(Pointer p) { super(p); }

    /** @see setGridX */
    public native int getGridX();
    /** \copybrief getGridX @see getGridX */
    public native void setGridX(int val);
    /** @see setGridY */
    public native int getGridY();
    /** \copybrief getGridY @see getGridY */
    public native void setGridY(int val);
    /** @see setRadius */
    public native int getRadius();
    /** \copybrief getRadius @see getRadius */
    public native void setRadius(int val);
    /** @see setNeighbors */
    public native int getNeighbors();
    /** \copybrief getNeighbors @see getNeighbors */
    public native void setNeighbors(int val);
    /** @see setThreshold */
    public native double getThreshold();
    /** \copybrief getThreshold @see getThreshold */
    public native void setThreshold(double val);
    public native @ByVal MatVector getHistograms();
    public native @ByVal Mat getLabels();

    /**
    @param radius The radius used for building the Circular Local Binary Pattern. The greater the
    radius, the smoother the image but more spatial information you can get.
    @param neighbors The number of sample points to build a Circular Local Binary Pattern from. An
    appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
    the higher the computational cost.
    @param grid_x The number of cells in the horizontal direction, 8 is a common value used in
    publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
    feature vector.
    @param grid_y The number of cells in the vertical direction, 8 is a common value used in
    publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
    feature vector.
    @param threshold The threshold applied in the prediction. If the distance to the nearest neighbor
    is larger than the threshold, this method returns -1.
    <p>
    ### Notes:
    <p>
    -   The Circular Local Binary Patterns (used in training and prediction) expect the data given as
        grayscale images, use cvtColor to convert between the color spaces.
    -   This model supports updating.
    <p>
    ### Model internal data:
    <p>
    -   radius see LBPHFaceRecognizer::create.
    -   neighbors see LBPHFaceRecognizer::create.
    -   grid_x see LLBPHFaceRecognizer::create.
    -   grid_y see LBPHFaceRecognizer::create.
    -   threshold see LBPHFaceRecognizer::create.
    -   histograms Local Binary Patterns Histograms calculated from the given training data (empty if
        none was given).
    -   labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     */
    public static native @Ptr LBPHFaceRecognizer create(int radius/*=1*/, int neighbors/*=8*/, int grid_x/*=8*/, int grid_y/*=8*/, double threshold/*=DBL_MAX*/);
    public static native @Ptr LBPHFaceRecognizer create();
}

/** \} */

 //namespace cv::face

// #endif //__OPENCV_FACEREC_HPP__


}
