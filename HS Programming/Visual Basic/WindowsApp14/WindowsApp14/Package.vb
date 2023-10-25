Public Class Package
   Private addressValue As String ' package address
   Private cityValue As String ' package city
   Private stateValue As String ' package state
   Private zipValue As String ' package zip code
   Private timeValue As Date ' arrival time
   Private packageNumberValue As Integer ' package number

   ' CPackage contructor
   Public Sub New(packageID As Integer)
      ArrivalTime = Date.Now
      SetPackage(String.Empty, String.Empty, String.Empty, String.Empty)
      PackageNumber = packageID ' unique package number
   End Sub ' New

   ' set properties of CPackage object
   Private Sub SetPackage(address As String,
      city As String, state As String, zip As String)

      addressValue = address
      cityValue = city
      stateValue = state
      zipValue = zip
   End Sub ' SetPackage

   ' property Address
   Public Property Address() As String
      ' get addressValue
      Get
         Return addressValue
      End Get

      ' set addressValue
      Set(value As String)
         addressValue = value
      End Set
   End Property ' Address

   ' property City
   Public Property City() As String
      ' get cityValue
      Get
         Return cityValue
      End Get

      ' set cityValue
      Set(value As String)
         cityValue = value
      End Set
   End Property ' City

   ' property State
   Public Property State() As String
      ' get stateValue
      Get
         Return stateValue
      End Get

      ' set stateValue
      Set(value As String)
         stateValue = value
      End Set
   End Property ' State

   ' property Zip
   Public Property Zip() As String
      ' get zipValue
      Get
         Return zipValue
      End Get

      ' set zipValue
      Set(value As String)
         zipValue = value
      End Set
   End Property ' Zip

   ' property PackageNumber
   Public Property PackageNumber() As Integer
      ' get packagenumberValue
      Get
         Return packagenumberValue
      End Get

      ' set packagenumberValue
      Set(value As Integer)
         packageNumberValue = value
      End Set
   End Property ' PackageNumber

   ' property ArrivalTime
   Public Property ArrivalTime() As Date
      ' get timeValue
      Get
         Return timeValue
      End Get

      ' set timeValue
      Set(value As Date)
         timeValue = value
      End Set
   End Property ' ArrivalTime
End Class ' Package

'**************************************************************************
'* (C) Copyright 1992-2013 by Deitel & Associates, Inc. and               *
'* Pearson Education, Inc. All Rights Reserved.                           *
'*                                                                        *
'* DISCLAIMER: The authors and publisher of this book have used their     *
'* best efforts in preparing the book. These efforts include the          *
'* development, research, and testing of the theories and programs        *
'* to determine their effectiveness. The authors and publisher make       *
'* no warranty of any kind, expressed or implied, with regard to these    *
'* programs or to the documentation contained in these books. The authors *
'* and publisher shall not be liable in any event for incidental or       *
'* consequential damages in connection with, or arising out of, the       *
'* furnishing, performance, or use of these programs.                     *
'**************************************************************************