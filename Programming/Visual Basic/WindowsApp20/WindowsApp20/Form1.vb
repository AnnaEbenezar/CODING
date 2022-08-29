Public Class StudentGradesForm
    Dim grades As Integer(,) = New Integer(0 To 9, 0 To 2) {}
    Dim studentCount As Integer = 0


    Private Sub submitButton_Click(sender As System.Object,
      e As System.EventArgs) Handles submitButton.Click


        grades(studentCount, 0) = Convert.ToInt32(test1TextBox.Text)
        grades(studentCount, 1) = Convert.ToInt32(test2TextBox.Text)
        grades(studentCount, 2) = Convert.ToInt32(test3TextBox.Text)


        Dim output As String =
         "Student " & studentCount & ControlChars.Tab


        For column As Integer = 0 To grades.GetUpperBound(1)

            If letterRadioButton.Checked = True Then

                output &= ControlChars.Tab &
               LetterGrade(grades(studentCount, column))
            Else

                output &= ControlChars.Tab &
               grades(studentCount, column)
            End If
        Next


        output &= ControlChars.Tab &
         CalculateStudentAverage(studentCount)

        gradesListBox.Items.Add(output)

        studentCount += 1


        averageLabel.Text = CalculateClassAverage()


        test1TextBox.Clear()
        test2TextBox.Clear()
        test3TextBox.Clear()
        test1TextBox.Focus()


        If studentCount = grades.GetUpperBound(0) + 1 Then
            inputGroupBox.Enabled = False
        End If
    End Sub


    Function CalculateStudentAverage(row As Integer) As String
        Dim gradeTotal As Integer = 0


        For column As Integer = 0 To grades.GetUpperBound(1)
            gradeTotal += grades(row, column)
        Next

        Dim studentAverage As String = String.Empty


        If letterRadioButton.Checked = True Then
            studentAverage =
            LetterGrade(gradeTotal / (grades.GetUpperBound(1) + 1))
        Else
            studentAverage = String.Format("{0:F}",
            (gradeTotal / (grades.GetUpperBound(1) + 1)))
        End If

        Return studentAverage
    End Function


    Function CalculateClassAverage() As String
        Dim classTotal As Integer = 0


        For row As Integer = 0 To studentCount - 1

            For column As Integer = 0 To grades.GetUpperBound(1)
                classTotal += grades(row, column)
            Next column
        Next row

        Dim classAverage As String = String.Empty


        If letterRadioButton.Checked = True Then
            classAverage = LetterGrade(classTotal /
            (studentCount * (grades.GetUpperBound(1) + 1)))
        Else
            classAverage = String.Format("{0:F}", (classTotal /
            (studentCount * (grades.GetUpperBound(1) + 1))))
        End If

        Return classAverage
    End Function


    Function LetterGrade(ByVal grade As Double) As String
        Dim output As String

        '
        Select Case grade
            Case Is >= 90
                output = "A"
            Case Is >= 80
                output = "B"
            Case Is >= 70
                output = "C"
            Case Is >= 60
                output = "D"
            Case Else
                output = "F"
        End Select

        Return output
    End Function


    Private Sub numericRadioButton_CheckedChanged(
      sender As System.Object, e As System.EventArgs) _
      Handles numericRadioButton.CheckedChanged


        If numericRadioButton.Checked = True AndAlso
         studentCount > 0 Then

            DisplayClassGrades()
        End If
    End Sub


    Private Sub letterRadioButton_CheckedChanged(
      sender As System.Object, e As System.EventArgs) _
      Handles letterRadioButton.CheckedChanged


        If letterRadioButton.Checked = True AndAlso
         studentCount > 0 Then

            DisplayClassGrades()
        End If
    End Sub


    Sub DisplayClassGrades()
        gradesListBox.Items.Clear()


        gradesListBox.Items.Add(ControlChars.Tab & ControlChars.Tab &
         "Test 1" & ControlChars.Tab &
         "Test 2" & ControlChars.Tab &
         "Test 3" & ControlChars.Tab & "Average")


        For row As Integer = 0 To studentCount - 1
            Dim output As String = "Student " & row & ControlChars.Tab


            For column As Integer = 0 To grades.GetUpperBound(1)
                If letterRadioButton.Checked = True Then

                    output &= ControlChars.Tab &
                  LetterGrade(grades(row, column))
                Else

                    output &= ControlChars.Tab & (grades(row, column))
                End If
            Next column


            output &= ControlChars.Tab & CalculateStudentAverage(row)


            gradesListBox.Items.Add(output)
        Next row


        averageLabel.Text = CalculateClassAverage()
    End Sub

End Class

